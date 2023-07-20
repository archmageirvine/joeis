package irvine.oeis.a040;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A040027 The Gould numbers.
 * @author Sean A. Irvine
 */
public class A040027 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k - 1).multiply(a(n - k)));
    }
    return sum;
  }
}
