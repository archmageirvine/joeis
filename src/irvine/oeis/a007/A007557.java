package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007557 Shifts left when inverse Moebius transform applied twice.
 * @author Sean A. Irvine
 */
public class A007557 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size() - 1;
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(a(d).multiply(Functions.SIGMA0.z(n / d)));
    }
    return sum;
  }
}
