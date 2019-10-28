package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026552;

/**
 * A027272 <code>a(n) = self-convolution</code> of row n of array T given by <code>A026552</code>.
 * @author Sean A. Irvine
 */
public class A027272 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k)));
    }
    return sum;
  }
}
