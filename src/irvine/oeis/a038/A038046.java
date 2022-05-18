package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A038046 Shifts left under transform T where Ta is (identity) DCONV a.
 * @author Sean A. Irvine
 */
public class A038046 extends MemorySequence {

  {
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
      sum = sum.add(get(d).multiply((n - 1) / d));
    }
    return sum;

  }
}
