package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010742 Shifts 4 places right under binomial transform.
 * @author Sean A. Irvine
 */
public class A010742 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 4) {
      return Z.ONE;
    } else {
      Z sum = a(n - 4);
      for (int k = 0; k < n; ++k) {
        sum = sum.subtract(Binomial.binomial(n, k).multiply(a(k)));
      }
      return sum;
    }
  }
}
