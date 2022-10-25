package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A038044 Shifts left under transform T where Ta is a DCONV a.
 * @author Sean A. Irvine
 */
public class A038044 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n - 1).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(a(d).multiply(a((n - 1) / d)));
    }
    return sum;

  }
}
