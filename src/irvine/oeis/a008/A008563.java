package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A008563 Coefficients of series arising in solution of Riccati equation y' <code>= y^2 + x^2</code>.
 * @author Sean A. Irvine
 */
public class A008563 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    final long m = 4 * n + 2;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(m, 4 * k + 3).multiply(get(k)).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
