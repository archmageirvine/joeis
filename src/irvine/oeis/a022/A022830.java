package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022830 a(n) = -[ n/2 ] + a([ n/2 ]) + a([ n/3 ]) + . . . + a([ n/n ]).
 * @author Sean A. Irvine
 */
public class A022830 extends MemorySequence {

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
      sum = sum.add(a(n / k));
    }
    return sum.subtract(n / 2);
  }
}
