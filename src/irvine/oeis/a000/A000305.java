package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000305 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A000305 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mFactorial = new MemoryFactorial();

  private Z t(final int n, final int k) {
    Z s = Z.ZERO;
    if (k <= n) {
      for (int j = k; j <= Math.min(n, 2 * k - 1); ++j) {
        s = s.add(mFactorial.factorial(j - 1)
                  .multiply(2 * j - k + 1)
                  .multiply(mFactorial.factorial(3 * n - k - j))
                  .divide(mFactorial.factorial(j - k + 1))
                  .divide(mFactorial.factorial(j - k))
                  .divide(mFactorial.factorial(2 * k - j - 1))
                  .divide(mFactorial.factorial(n - j)));
      }
      s = s.multiply(k).divide(mFactorial.factorial(2 * n - k + 1));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      r = r.add(t(mN, k));
    }
    return r;
  }
}
