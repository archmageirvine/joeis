package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045499 Fourth-from-right diagonal of triangle A121207.
 * @author Sean A. Irvine
 */
public class A045499 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n + 2, k + 3).multiply(a(k)));
    }
    return sum;
  }
}
