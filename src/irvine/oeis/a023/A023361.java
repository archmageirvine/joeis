package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000217;

/**
 * A023361.
 * @author Sean A. Irvine
 */
public class A023361 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int t, k = 1; (t = A000217.triangular(k).intValueExact()) <= n; ++k) {
      sum = sum.add(get(n - t));
    }
    return sum;
  }
}
