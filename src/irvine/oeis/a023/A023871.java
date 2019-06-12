package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023871 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^(-k^2)</code>.
 * @author Sean A. Irvine
 */
public class A023871 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(get(n - k).multiply(Cheetah.factor(k).sigma(3)));
    }
    return sum.divide(n);
  }
}

