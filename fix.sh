#!/bin/bash
#
# Attempt to automatically fix a bunch of style problems in the code for
# the OEIS.  This is necessarily conservative.

find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read s; do
    sed -e 's/Z\.valueOf(0L\?)/Z.ZERO/g' \
        -e 's/Z\.valueOf(1L\?)/Z.ONE/g' \
        -e 's/Z\.valueOf(2L\?)/Z.TWO/g' \
        -e 's/Z\.valueOf(3L\?)/Z.THREE/g' \
        -e 's/Z\.valueOf(4L\?)/Z.FOUR/g' \
        -e 's/Z\.valueOf(5L\?)/Z.FIVE/g' \
        -e 's/Z\.valueOf(6L\?)/Z.SIX/g' \
        -e 's/Z\.valueOf(7L\?)/Z.SEVEN/g' \
        -e 's/Z\.valueOf(8L\?)/Z.EIGHT/g' \
        -e 's/Z\.valueOf(9L\?)/Z.NINE/g' \
        -e 's/Z\.valueOf(10L\?)/Z.TEN/g' \
        -e 's/Z\.valueOf(-1L\?)/Z.NEG_ONE/g' \
        -e 's/new Z("0")/Z.ZERO/g' \
        -e 's/new Z("1")/Z.ONE/g' \
        -e 's/new Z("2")/Z.TWO/g' \
        -e 's/new Z("3")/Z.THREE/g' \
        -e 's/new Z("4")/Z.FOUR/g' \
        -e 's/new Z("5")/Z.FIVE/g' \
        -e 's/new Z("6")/Z.SIX/g' \
        -e 's/new Z("7")/Z.SEVEN/g' \
        -e 's/new Z("8")/Z.EIGHT/g' \
        -e 's/new Z("9")/Z.NINE/g' \
        -e 's/new Z("10")/Z.TEN/g' \
        -e 's/new Z("-1")/Z.NEG_ONE/g' \
        -e 's/new Q(0)/Q.ZERO/g' \
        -e 's/new Q(1)/Q.ONE/g' \
        -e 's/new Q(2)/Q.TWO/g' \
        -e 's/new Q(3)/Q.THREE/g' \
        -e 's/new Q(4)/Q.FOUR/g' \
        -e 's/new Q(5)/Q.FIVE/g' \
        -e 's/new Q(6)/Q.SIX/g' \
        -e 's/new Q(7)/Q.SEVEN/g' \
        -e 's/new Q(8)/Q.EIGHT/g' \
        -e 's/new Q(9)/Q.NINE/g' \
        -e 's/new Q(10)/Q.TEN/g' \
        -e 's/= 2 - 1;/= 1;/g' \
        -e 's/= 1 - 1;/= 0;/g' \
        -e 's/= 0 - 1;/= -1;/g' \
        -e 's/CR\.valueOf(0L\?)/CR.ZERO/g' \
        -e 's/CR\.valueOf(1L\?)/CR.ONE/g' \
        -e 's/CR\.valueOf(2L\?)/CR.TWO/g' \
        -e 's/CR\.valueOf(3L\?)/CR.THREE/g' \
        -e 's/CR\.valueOf(4L\?)/CR.FOUR/g' \
        -e 's/CR\.valueOf(5L\?)/CR.FIVE/g' \
        -e 's/CR\.valueOf(6L\?)/CR.SIX/g' \
        -e 's/CR\.valueOf(7L\?)/CR.SEVEN/g' \
        -e 's/CR\.valueOf(8L\?)/CR.EIGHT/g' \
        -e 's/CR\.valueOf(9L\?)/CR.NINE/g' \
        -e 's/CR\.valueOf(10L\?)/CR.TEN/g' \
        -e 's/pow(2)/square()/g' \
        -e 's/pow(Z\.TWO)/square()/g' \
        -e 's/[A-Z]*\.ZERO.subtract(\([^()]*\))/\1.negate()/g' \
        -e 's/[A-Z]*\.ZERO.subtract(\(\([^()]*([^()]*)\)\+[^()]*\))/\1.negate()/g' \
        -e 's/[A-Z]*\.ZERO.subtract(\(\(\([^()]*([^()]*([^()]*)\)*[^()]*)\)\*[^()]*\))/\1.negate()/g' \
        -e '/^public class/,$ b; /@author/,$ {/^$/d}' \
        <"${s}" >"${s}.t"
    if cmp -s "${s}" "${s}.t" >&/dev/null; then
        /bin/rm "${s}.t"
    else
        mv "${s}.t" "${s}"
        echo "Modified ${s}"
    fi
done

# Fix constructor comments.
for f in $(ag -G [.]java -l ' \* Construct the sequence'); do
    perl -0777 -pi -e 's/\/\*\* *\n   \* Construct the sequence.\n   \*\//\/** Construct the sequence. *\//igs' "${f}"
done
