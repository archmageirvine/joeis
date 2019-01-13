package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000995.
 * @author Sean A. Irvine
 */
public class A000995 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size() - 2;
    if (n <= 1) {
      return n == -2 || n == 0 ? Z.ZERO : Z.ONE;
    }
    Z sum = Z.valueOf(n);
    for (int k = 2; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(k)));
    }
    return sum;
  }
}

