package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026584;

/**
 * A027282 <code>a(n) = self-convolution</code> of row n of array T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A027282 extends A026584 {

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
