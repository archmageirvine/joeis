package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007462 Shifts left under XOR-convolution with itself.
 * @author Sean A. Irvine
 */
public class A007462 extends MemorySequence {

  @Override
  public Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).xor(get(n - k - 1)));
    }
    return sum;
  }
}

