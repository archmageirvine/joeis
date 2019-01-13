package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000997.
 * @author Sean A. Irvine
 */
public class A000997 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return n == 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n - 3; ++k) {
      sum = sum.add(Binomial.binomial(n - 3, k).multiply(get(k)));
    }
    return sum;
  }
}

