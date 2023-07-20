package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A056144 a(1) = 1, a(m+1) = Sum_{k=1..m} gcd(m, a(k)).
 * @author Sean A. Irvine
 */
public class A056144 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final Z m = Z.valueOf(n);
    Z sum = Z.ZERO;
    for (final Z z : this) {
      sum = sum.add(z.gcd(m));
    }
    return sum;
  }
}
