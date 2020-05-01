package irvine.oeis.a031;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001350;

/**
 * A031367 Inflation orbit counts.
 * @author Sean A. Irvine
 */
public class A031367 implements Sequence {

  private final MemorySequence mA001350 = MemorySequence.cachedSequence(new A001350());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA001350.a(mN / d).multiply(Mobius.mobius(d)));
    }
    return sum;
  }
}
