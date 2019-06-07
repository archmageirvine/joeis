package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022829 <code>a(n) = a([ .5 + n/2 ]) + a([ .5 + n/3 ]) + ... + a([ .5 + n/n ])</code>.
 * @author Sean A. Irvine
 */
public class A022829 extends MemorySequence {

  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 2; k <= n; ++k) {
      sum = sum.add(get((2 * n + k) / (2 * k)));
    }
    return sum;
  }
}
