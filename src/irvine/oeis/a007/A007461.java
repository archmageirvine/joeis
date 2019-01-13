package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007461.
 * @author Sean A. Irvine
 */
public class A007461 extends MemorySequence {

  @Override
  public Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).and(get(n - k - 1)));
    }
    return sum;
  }
}

