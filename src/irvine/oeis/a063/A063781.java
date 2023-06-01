package irvine.oeis.a063;

import irvine.math.cr.CR;

/**
 * A063781 a(n) is the number of pairs of integer quadruples (b_1, b_2, b_3, b_4) and (c_1, c_2, c_3, c_4) satisfying 1 &lt;= b_1 &lt; b_2 &lt; b_3 &lt; b_4 &lt; n, 1 &lt;= c_1 &lt; c_2 &lt; c_3 &lt; c_4 &lt; n, b_i != c_j for all i,j = 1,2,3,4 and Product_{i=1..4} sin(2*Pi*b_i/n) = Product_{i=1..4} sin(2*Pi*c_i/n).
 * @author Sean A. Irvine
 */
public class A063781 extends A063780 {

  @Override
  protected boolean testPrecise(final int n, final int[] a, final int[] b) {
    CR sinA = CR.ONE;
    CR sinB = CR.ONE;
    final CR zn = CR.valueOf(n);
    for (int k = 0; k < a.length; ++k) {
      sinA = sinA.multiply(CR.TAU.multiply(a[k]).divide(zn).sin());
      sinB = sinB.multiply(CR.TAU.multiply(b[k]).divide(zn).sin());
    }
    return sinA.compareTo(sinB, ACCURACY) == 0;
  }

  @Override
  protected double trig(final int n, final int v) {
    return Math.sin(TAU * v / n);
  }
}
