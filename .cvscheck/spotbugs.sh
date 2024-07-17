#!/bin/bash
#
# Run spotbugs

export PATH=${HOME}/java_apps/spotbugs/bin:${PATH}
export SPOTBUGS_OPTS="-pluginList ${HOME}/java_apps/spotbugs-3.1.0-RC5/lib/fb-contrib-7.0.5.sb.jar"
export config=${HOME}/joeis/.cvscheck/spotbugs_config.xml

# There is an ant task that compile-src-debug to be run first

function spotbugsall() {
    if type -p spotbugs >/dev/null 2>&1; then
        echo "Using spotbugs $SPOTBUGS_OPTS -auxclasspath ${CLASSPATH} -exclude ${config} -textui ${HOME}/joeis/build.tmp/classes-debug"
        spotbugs ${SPOTBUGS_OPTS} -auxclasspath "${CLASSPATH}" -exclude "${config}" -textui "${HOME}/joeis/build.tmp/classes-debug" 2> /dev/null | awk '{print $0}END{print "spotbugsall completed: "NR" warnings"}'
    else
        echo "spotbugs not found"
    fi
}

spotbugsall
