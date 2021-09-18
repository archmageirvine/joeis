package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000081;

/**
 * A051529 INVERT transform of A000081 = [1, 1, 1, 2, 4, 9, 20, 48, 115, 286,...].
 * @author Sean A. Irvine
 */
public class A051529 extends MemorySequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000081());

  private Z b(final int n) {
    return n <= 1 ? Z.ONE : mA.a(n);
  }

  private Z c(final int n) {
    return n < 1 ? Z.ONE : a(n);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n + 1; ++k) {
      sum = sum.add(b(k - 1).multiply(c(n - k)));
    }
    return sum;
  }
}
