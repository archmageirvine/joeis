package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A038045 Shifts left under transform T where Ta is phi DCONV a.
 * @author Sean A. Irvine
 */
public class A038045 extends MemorySequence {

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
      sum = sum.add(a(d).multiply(Functions.PHI.l((n - 1) / d)));
    }
    return sum;

  }
}
