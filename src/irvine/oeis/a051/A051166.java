package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051152.
 * @author Sean A. Irvine
 */
public class A051166 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd(((n - k) & 1) == 0, Binomial.binomial(n, k).multiply(k < 3 ? Z.ONE : get(k / 3)));
    }
    return sum;
  }
}
