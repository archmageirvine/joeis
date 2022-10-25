package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A054946 Number of strongly connected labeled tournaments on n nodes.
 * @author Sean A. Irvine
 */
public class A054946 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ONE.shiftLeft(n * (n - 1) / 2);
    for (int k = 1; k < n; ++k) {
      sum = sum.subtract(Binomial.binomial(n, k).multiply(a(k)).shiftLeft((n - k) * (n - k - 1) / 2));
    }
    return sum;
  }
}
