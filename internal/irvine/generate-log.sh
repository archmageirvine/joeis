#!/bin/bash

dir=~/joeis

function cr() {
    case $1 in
        1)
            echo CR.ONE
            ;;
        2)
            echo CR.TWO
            ;;
        3)
            echo CR.THREE
            ;;
        4)
            echo CR.FOUR
            ;;
        5)
            echo CR.FIVE
            ;;
        *)
            echo "CR.valueOf($1)"
            ;;
    esac
}

zgrep 'Decimal expansion of log_[0-9]\+ ([0-9]*)\.$' ~/names.gz | sed 's/Decimal expansion of log_//' | tr -d '().' | while read anumber b c; do
    package=${anumber%???}
    package=${package/A/a}
    dest=${dir}/src/irvine/oeis/${package}/${anumber}.java
    b=$(cr $b)
    c=$(cr $c)
    if [[ ! -r ${dest} ]]; then
        echo "Building ${anumber}"
        cat >${dest} <<EOF
package irvine.oeis.${package};

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * ${anumber}.
 * @author Sean A. Irvine
 */
public class ${anumber} extends DecimalExpansionSequence {

  private static final CR N = ${c}.log().divide(${b}.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
EOF
        {
            cd ${dir} && ./make_oeis_test.sh "${anumber}" && cd -
        }
    fi
done
