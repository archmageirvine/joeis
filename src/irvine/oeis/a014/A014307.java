package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014307 Expansion of <code>sqrt(</code> exp(x) <code>/ ( 2 -</code> exp(x) <code>))</code>.
 * @author Sean A. Irvine
 */
public class A014307 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ONE;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).subtract(1).multiply(get(k)));
    }
    return sum;
  }
}

