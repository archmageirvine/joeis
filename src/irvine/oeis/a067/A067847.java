package irvine.oeis.a067;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067847 Number of divisors d of n! such that d+1 is prime.
 * @author Sean A. Irvine
 */
public class A067847 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
    mFactor.factor(mFactorSequence);
    long cnt = 0;
    for (final Z d : mFactorSequence.divisors()) {
      if (d.add(1).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
