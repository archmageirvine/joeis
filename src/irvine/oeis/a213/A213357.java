package irvine.oeis.a213;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A213357 E.g.f. satisfies A(x) = 1 + (exp(x) - 1) * A(exp(x) - 1).
 * @author Sean A. Irvine
 */
public class A213357 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(a(k - 1).multiply(k).multiply(Stirling.secondKind(n, k)));
    }
    return sum;
  }
}
