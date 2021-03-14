package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045500 Fifth-from-right diagonal of triangle A121207.
 * @author Sean A. Irvine
 */
public class A045500 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n + 3, k + 4).multiply(get(k)));
    }
    return sum;
  }
}
