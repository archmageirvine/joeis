package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A341020 INVERT transform of the binary weight.
 * @author Georg Fischer
 */
public class A341020 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(a(n - k).multiply(Long.bitCount(k)));
    }
    return sum;
  }
}
