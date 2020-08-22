package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027069 a(n) = diagonal sum of left-justified array T given by A027052.
 * @author Sean A. Irvine
 */
public class A027069 extends A027052 {

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
