package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026022;

/**
 * A027294 Self-convolution of row n of array T given by A026022.
 * @author Sean A. Irvine
 */
public class A027294 extends A026022 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN >= 3 ? (mN + 1) / 2 + 1 : mN;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, lim - k)));
    }
    return sum;
  }
}
