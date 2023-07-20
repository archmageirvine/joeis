package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A010740 Shifts 3 places right under binomial transform.
 * @author Sean A. Irvine
 */
public class A010740 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    } else {
      Z sum = a(n - 3);
      for (int k = 0; k < n; ++k) {
        sum = sum.subtract(Binomial.binomial(n, k).multiply(a(k)));
      }
      return sum;
    }
  }
}
