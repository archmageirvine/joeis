package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001001;
import irvine.oeis.memory.MemorySequence;

/**
 * A060983 Number of primitive sublattices of index n in generic 3-dimensional lattice.
 * @author Sean A. Irvine
 */
public class A060983 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001001());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      final int d3 = d * d * d;
      if (mN % d3 == 0) {
        sum = sum.add(mA.a(mN / d3 - 1).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum;
  }
}
