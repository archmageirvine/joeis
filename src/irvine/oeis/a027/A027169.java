package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027169 <code>a(n) = self-convolution</code> of row n of array T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027169 extends A027157 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, mN - k)));
    }
    return sum;
  }
}
