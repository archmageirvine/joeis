package irvine.oeis.a011;

import irvine.math.cr.CR;

/**
 * A011191 Coefficients in expansion of Pi as Sum <code>a(n)/(n*n!*(n+1)!), n=1..inf</code>, as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A011191 extends A011189 {

  @Override
  protected CR value() {
    return CR.PI;
  }
}

