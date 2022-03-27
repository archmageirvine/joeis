package irvine.oeis.a055;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a327.A327371;

/**
 * A055540 Total number of leaves (nodes of vertex degree 1) in all graphs of n nodes.
 * @author Sean A. Irvine
 */
public class A055540 extends A327371 {

  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> t = g(++mN).coeff(mN);
    Z sum = Z.ZERO;
    for (int k = 1; k <= t.degree(); ++k) {
      sum = sum.add(t.get(k).multiply(k));
    }
    return sum;
  }
}
