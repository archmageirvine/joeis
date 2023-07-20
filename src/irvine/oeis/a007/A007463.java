package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007463 Shifts left under lcm-convolution with itself.
 * @author Sean A. Irvine
 */
public class A007463 extends MemorySequence {

  @Override
  public Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(a(k).lcm(a(n - k - 1)));
    }
    return sum;
  }
}

