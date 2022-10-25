package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005046 Number of partitions of a 2n-set into even blocks.
 * @author Sean A. Irvine
 */
public class A005046 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      s = s.add(Binomial.binomial(2L * n - 1, 2L * k - 1).multiply(a(n - k)));
    }
    return s;
  }
}
