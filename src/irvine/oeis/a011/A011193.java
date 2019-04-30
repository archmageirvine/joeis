package irvine.oeis.a011;

import irvine.math.cr.CR;

/**
 * A011193 Coefficients in expansion of <code>sqrt(2)</code> as Sum <code>a(n)/(n*n!*(n+1)!), n=1</code>..inf, as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A011193 extends A011189 {

  @Override
  protected CR value() {
    return CR.SQRT2;
  }
}

