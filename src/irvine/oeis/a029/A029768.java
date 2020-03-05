package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A029768 Number of increasing mobiles with n elements.
 * @author Sean A. Irvine
 */
public class A029768 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ZERO : Z.ONE;
    }
    Z sum = get(n - 1);
    for (int k = 1; k <= n - 2; ++k) {
      sum = sum.add(Binomial.binomial(n - 2, k).multiply(get(k).multiply(get(n - k))));
    }
    return sum;
  }
}
