package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022826 a(n) = a([ (n+1)/2 ]) + a([ (n+1)/3 ]) + . . . + a([ (n+1)/n ]).
 * @author Sean A. Irvine
 */
public class A022826 extends MemorySequence {

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
      sum = sum.add(a((n + 1) / k));
    }
    return sum;
  }
}
