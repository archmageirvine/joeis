#!/bin/bash
#
# Try and get 260 characters of data for a sequence.  Makes assumptions
# about classpath and similar.

a=${1}
if [[ ${a} = "" ]]; then
    echo "Usage: $0 A-number"
    exit
fi
target=${2:-260}

function collect() {
    res=
    while read term; do
        len=$((${#res}+${#term}+2))
        if [[ ${len} -gt ${target} ]]; then
            echo "${res}"
            return
        fi
        if [[ ${res} = "" ]]; then
            res=${term}
        else
            res="${res}, ${term}"
        fi
    done
    echo "${res}"
}

java irvine.oeis.SequenceFactory "${a}" | collect
