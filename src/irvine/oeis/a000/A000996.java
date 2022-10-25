package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000996 Shifts 3 places left under binomial transform.
 * @author Sean A. Irvine
 */
public class A000996 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ONE;
    for (int k = 3; k <= n - 3; ++k) {
      sum = sum.add(Binomial.binomial(n - 3, k).multiply(a(k)));
    }
    return sum;
  }
}

