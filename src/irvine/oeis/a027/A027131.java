package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027131 a(n) = diagonal sum of left justified array T given by A027113.
 * @author Sean A. Irvine
 */
public class A027131 extends A027113 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
