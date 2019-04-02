package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007558 Shifts 2 places left when e.g.f. is squared.
 * @author Sean A. Irvine
 */
public class A007558 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n - 1; ++k) {
      sum = sum.add(get(k).multiply(get(n - 2 - k)).multiply(Binomial.binomial(n - 2, k)));
    }
    return sum;
  }
}
