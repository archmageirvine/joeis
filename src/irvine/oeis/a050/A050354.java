package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A050354 Number of ordered factorizations of n with one level of parentheses.
 * @author Sean A. Irvine
 */
public class A050354 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        sum = sum.add(a(d));
      }
    }
    return sum.multiply2();
  }

  @Override
  public Z next() {
    return super.next().divide2().max(Z.ONE);
  }
}
