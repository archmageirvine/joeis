package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071304 a(n) = (1/2) * (number of n X n 0..4 matrices M with MM' mod 5 = I, where M' is the transpose of M and I is the n X n identity matrix).
 * @author Sean A. Irvine
 */
public class A071304 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int t = ++mN / 2;
    Z prod = Z.ONE;
    for (int k = 0; k < t; ++k) {
      final Z u = Z.FIVE.pow(2 * t).subtract(Z.FIVE.pow(2 * k));
      prod = prod.multiply(u);
    }
    if ((mN & 1) == 0) {
      prod = prod.divide(Z.FIVE.pow(t).add(1));
    } else {
      prod = prod.multiply(Z.FIVE.pow(t));
    }
    return prod;
  }
}
