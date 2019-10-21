package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026956 <code>a(n) = self-convolution</code> of array T given by <code>A026615</code>.
 * @author Sean A. Irvine
 */
public class A026956 extends A026615 {

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
