package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A027416 Number of unlabeled (and unrooted) trees on n nodes having a centroid.
 * @author Sean A. Irvine
 */
public class A027416 extends A000081 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = a(mN);
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.subtract(a(mN - k).multiply(a(k)));
    }
    return sum;
  }
}
