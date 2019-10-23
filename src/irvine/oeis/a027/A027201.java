package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026714;

/**
 * A027201 <code>a(n) = self-convolution</code> of row n of array T given by <code>A026714</code>.
 * @author Sean A. Irvine
 */
public class A027201 extends A026714 {

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
