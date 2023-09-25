package irvine.oeis.a341;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A341407 INVERT transform of pi (A000720).
 * @author Georg Fischer
 */
public class A341407 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(a(n - k).multiply(Puma.primePi(k)));
    }
    return sum;
  }
}
