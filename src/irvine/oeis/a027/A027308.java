package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027308 <code>a(n) = self-convolution</code> of row n of array T given by <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A027308 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN + 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN + 2 - k)));
    }
    return sum;
  }
}
