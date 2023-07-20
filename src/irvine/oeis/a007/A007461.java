package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007461 Shifts left under AND-convolution with itself.
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
      sum = sum.add(a(k).and(a(n - k - 1)));
    }
    return sum;
  }
}

