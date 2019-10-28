package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026769;

/**
 * A027239 Self-convolution of row n of array T given by <code>A026769</code>.
 * @author Sean A. Irvine
 */
public class A027239 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k)));
    }
    return sum;
  }
}
