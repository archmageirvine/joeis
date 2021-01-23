package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033678 Number of labeled Eulerian graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A033678 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(k).multiply(get(k)).shiftLeft((k - n + 2) * (k - n + 1) / 2));
    }
    return Z.ONE.shiftLeft((n - 2) * (n - 1) / 2).subtract(sum.divide(n));
  }
}
