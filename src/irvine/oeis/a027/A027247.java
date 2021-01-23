package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026780;

/**
 * A027247 a(n) = self-convolution of row n of array T given by A026780.
 * @author Sean A. Irvine
 */
public class A027247 extends A026780 {

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
