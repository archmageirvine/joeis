package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049687.
 * @author Sean A. Irvine
 */
public class A049688 extends A049687 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(k, mN - k));
    }
    return sum;
  }
}
