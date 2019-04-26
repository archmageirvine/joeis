#!/bin/bash
#
# Report on various state of implementaitons.

DEAD=src/irvine/oeis/dead.lst
NOT_DONE=src/irvine/oeis/notdone.dat

echo "Checking for implementations without tests"
find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read s; do
    t=${s/src/test}
    t=${t/.java/Test.java}
    a=${s##*/}
    a=${a%.java}
    [[ -r ${t} ]] || grep -q "${a}" "${NOT_DONE}" || grep -q "${a}" "${DEAD}" || ./make_oeis_test.sh "${a}"
done

echo "First unimplemented sequences"
{
    find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | sed 's%.*/%%;s%.java%%'
    awk '{print $1}' <"${NOT_DONE}"
    cat "${DEAD}"
} | sort | uniq | awk 'BEGIN{b=0}{b=b+1;a=sprintf("A%06d",b); if ($0 != a) {print a; gsub("A0*","",a); b=a+1;}}' | head -5

