package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A050353 Number of 5-level labeled linear rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A050353 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(a(k)));
    }
    return sum.multiply(4).add(1);
  }
}
