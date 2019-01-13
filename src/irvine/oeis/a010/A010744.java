package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010744.
 * @author Sean A. Irvine
 */
public class A010744 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 5) {
      return Z.ONE;
    } else {
      Z sum = get(n - 5);
      for (int k = 0; k < n; ++k) {
        sum = sum.subtract(Binomial.binomial(n, k).multiply(get(k)));
      }
      return sum;
    }
  }
}
