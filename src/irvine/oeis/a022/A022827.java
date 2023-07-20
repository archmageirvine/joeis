package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A022827 a(n) = absolute value of ( a([ n/2 ]) - a([ n/3 ]) + ... + ((-1)^n)a([ n/n ]) ).
 * @author Sean A. Irvine
 */
public class A022827 extends MemorySequence {

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
      sum = sum.signedAdd((k & 1) == 0, a(n / k));
    }
    return sum.abs();
  }
}
