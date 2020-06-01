package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001610;

/**
 * A032190 Number of cyclic compositions of n into parts <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A032190 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001610());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d - 1).multiply(LongUtils.phi(mN / d)));
    }
    return sum.divide(mN);
  }
}
