package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a008.A008578;

/**
 * A030018.
 * @author Sean A. Irvine
 */
public class A030018 extends MemorySequence {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.subtract(mPrimes.a(n - k).multiply(get(k)));
    }
    return sum;
  }
}
