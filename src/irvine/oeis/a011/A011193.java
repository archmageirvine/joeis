package irvine.oeis.a011;

import irvine.math.cr.CR;

/**
 * A011193 Coefficients in expansion of sqrt(2) as Sum_{n&gt;=1} a(n)/(n*n!*(n+1)!), as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A011193 extends A011189 {

  @Override
  protected CR value() {
    return CR.SQRT2;
  }
}

