package irvine.oeis.a380;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003030;
import irvine.oeis.memory.MemorySequence;

/**
 * A380374 Number of ways to topologically sort the strong components of a labeled digraph on [n].
 * @author Gregory Morse
 */
public class A380374 extends MemorySequence {
  private final DirectSequence mStrong = DirectSequence.create(new A003030());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      final Z ways = Binomial.binomial(n, k).shiftLeft((long) k * (n - k));
      sum = sum.add(ways.multiply(mStrong.a(k)).multiply(a(n - k)));
    }
    return sum;
  }
}
