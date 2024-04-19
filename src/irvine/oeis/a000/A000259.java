package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
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
        sum = sum.add(Functions.FACTORIAL.z(j - 1)
                      .multiply(2L * j - k)
                      .multiply(Functions.FACTORIAL.z(3 * n - j - k - 1))
                      .divide(Functions.FACTORIAL.z(j - k).square())
                      .divide(Functions.FACTORIAL.z(2 * k - j))
                      .divide(Functions.FACTORIAL.z(n - j)));
      }
      return sum.multiply(k).divide(Functions.FACTORIAL.z(2 * n - k));
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
