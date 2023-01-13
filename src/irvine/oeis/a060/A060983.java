package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001001;

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
        sum = ZUtils.mobiusAdd(Mobius.mobius(d), sum, mA.a(mN / d3 - 1));
      }
    }
    return sum;
  }
}
