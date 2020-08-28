package irvine.oeis.a027;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027423 Number of divisors of n!.
 * @author Sean A. Irvine
 */
public class A027423 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = -1;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    return mFactorSequence.sigma0();
  }
}
