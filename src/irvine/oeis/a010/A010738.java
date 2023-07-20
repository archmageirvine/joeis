package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A010738 Shifts 2 places right under binomial transform.
 * @author Sean A. Irvine
 */
public class A010738 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    } else {
      Z sum = a(n - 2);
      for (int k = 0; k < n; ++k) {
        sum = sum.subtract(Binomial.binomial(n, k).multiply(a(k)));
      }
      return sum;
    }
  }
}
