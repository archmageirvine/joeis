package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010746 Shifts 6 places right under binomial transform.
 * @author Sean A. Irvine
 */
public class A010746 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 6) {
      return Z.ONE;
    } else {
      Z sum = a(n - 6);
      for (int k = 0; k < n; ++k) {
        sum = sum.subtract(Binomial.binomial(n, k).multiply(a(k)));
      }
      return sum;
    }
  }
}
