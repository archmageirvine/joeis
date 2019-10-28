package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027287 Self-convolution of array T given by <code>A026009</code>.
 * @author Sean A. Irvine
 */
public class A027287 extends A026009 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2 + 1; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, mN / 2 + 1 - k)));
    }
    return sum;
  }
}
