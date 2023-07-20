package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A014535 Number of B-trees of order 3 with n leaves.
 * @author Sean A. Irvine
 */
public class A014535 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.valueOf(n);
    }
    Z sum = Z.ZERO;
    for (int k = (n + 2) / 3; k <= n / 2; ++k) {
      sum = sum.add(Binomial.binomial(k, 3 * k - n).multiply(a(k)));
    }
    return sum;
  }
}
