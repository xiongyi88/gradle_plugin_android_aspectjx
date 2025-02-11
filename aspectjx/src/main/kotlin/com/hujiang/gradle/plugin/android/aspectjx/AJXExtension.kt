/*
 * Copyright 2018 firefly1126, Inc.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.gradle_plugin_android_aspectjx
 */
package com.hujiang.gradle.plugin.android.aspectjx


/**
 * class description here
 * @author simon* @version 1.0.0* @since 2016-05-05
 */
open class AJXExtension {

    val includes = mutableListOf<String>()
    val excludes = mutableListOf<String>()
    val ajcArgs = mutableListOf<String>()
    var enabled = true

    fun include(vararg filters: String): AJXExtension {
        this.includes.addAll(filters)
        return this
    }

    fun exclude(vararg filters: String): AJXExtension {
        this.excludes.addAll(filters)
        return this
    }

    fun ajcArgs(vararg ajcArgs: String): AJXExtension {
        this.ajcArgs.addAll(ajcArgs)
        return this
    }

    override fun toString(): String {
        return "AJXExtension(includes=$includes, excludes=$excludes, ajcArgs=$ajcArgs, enabled=$enabled)"
    }

}
