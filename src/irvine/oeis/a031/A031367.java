package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001350;
import irvine.oeis.memory.MemorySequence;

/**
 * A031367 Inflation orbit counts.
 * @author Sean A. Irvine
 */
public class A031367 extends Sequence1 {

  private final MemorySequence mA001350 = MemorySequence.cachedSequence(new A001350());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA001350.a(mN / d).multiply(Functions.MOBIUS.i(d)));
    }
    return sum;
  }
}
