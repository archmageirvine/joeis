package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A033462 Exponential (or <code>"EXP")</code> transform of squares <code>A000290</code>.
 * @author Sean A. Irvine
 */
public class A033462 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, j - 1).multiply(j * (long) j).multiply(get(n - j)));
    }
    return sum;
  }
}
