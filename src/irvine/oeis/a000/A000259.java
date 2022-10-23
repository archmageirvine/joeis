package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000259 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A000259 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Z b(final int n, final int k) {
    // Algorithm of E. Deutsch
    if (k <= n) {
      Z sum = Z.ZERO;
      for (int j = k; j <= Math.min(n, 2 * k); ++j) {
        sum = sum.add(mF.factorial(j - 1)
                      .multiply(2 * j - k)
                      .multiply(mF.factorial(3 * n - j - k - 1))
                      .divide(mF.factorial(j - k).square())
                      .divide(mF.factorial(2 * k - j))
                      .divide(mF.factorial(n - j)));
      }
      return sum.multiply(k).divide(mF.factorial(2 * n - k));
    } else {
      return Z.ZERO;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      r = r.add(b(mN, j));
    }
    return r;
  }
}
