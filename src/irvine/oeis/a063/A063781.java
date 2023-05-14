package irvine.oeis.a063;

import irvine.math.cr.CR;

/**
 * A063781 Numbers k such that there exist sequences a_i, b_i in N (i=1,2,3,4) with 0 &lt; a_1 &lt; a_2 &lt; a_3 &lt; a_4 &lt; k, 0 &lt; b_1 &lt; b_2 &lt; b_3 &lt; b_4 &lt; k and a_i != b_j for all i,j = 1,2,3,4, satisfying both Sum_{i=1..4} a_i = Sum_{i=1..4} b_i = 2*k and Product_{i=1..4} sin(a_i * Pi/(2*k)) = Product_{i=1..4} sin(b_i * Pi/(2*k)).
 * @author Sean A. Irvine
 */
public class A063781 extends A063780 {

  @Override
  protected boolean testPrecise(final int n, final int[] a, final int[] b) {
    CR sinA = CR.ONE;
    CR sinB = CR.ONE;
    final CR n2 = CR.valueOf(2 * n);
    for (int k = 0; k < a.length; ++k) {
      sinA = sinA.multiply(CR.PI.multiply(a[k]).divide(n2).sin());
      sinB = sinB.multiply(CR.PI.multiply(b[k]).divide(n2).sin());
    }
    return sinA.compareTo(sinB, ACCURACY) == 0;
  }

  @Override
  protected double trig(final int n, final int[] a) {
    double sin = 1;
    final double n2 = 2 * n;
    for (final int v : a) {
      sin *= Math.sin(Math.PI * v / n2);
    }
    return sin;
  }

}
