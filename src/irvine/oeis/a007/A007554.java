package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007554 Unique attractor for (RIGHT then MOBIUS) transform.
 * @author Sean A. Irvine
 */
public class A007554 extends MemorySequence {

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
      sum = sum.add(get(d).multiply(Mobius.mobius(n / d)));
    }
    return sum;
  }
}
