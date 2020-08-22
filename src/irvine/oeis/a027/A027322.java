package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027322 Self-convolution of row n of array T given by A026120.
 * @author Sean A. Irvine
 */
public class A027322 extends A026120 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.TWO;
    }
    Z sum = Z.ZERO;
    for (long k = -1; k <= mN; ++k) {
      sum = sum.add(u(mN, k).multiply(u(mN, mN - 1 - k)));
    }
    return sum;
  }
}
