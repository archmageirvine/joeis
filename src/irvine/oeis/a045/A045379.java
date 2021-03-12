package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045379 E.g.f.: exp(4*z + exp(z) - 1).
 * @author Sean A. Irvine
 */
public class A045379 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1).multiply(4);
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k).multiply(get(k)));
    }
    return sum;
  }
}
