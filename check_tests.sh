#!/bin/bash
#
# Check that all currently implemented sequences have a corresponding
# test file.

find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read s; do
    t=${s/src/test}
    t=${t/.java/Test.java}
    a=${s##*/}
    a=${a%.java}
    [[ -r ${t} ]] || grep -q "${a}" src/irvine/oeis/notdone.dat || grep -q "${a}" src/irvine/oeis/dead.lst || ./make_oeis_test.sh "${a}"
done
