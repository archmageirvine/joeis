package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055204 Squarefree part of n!: n! divided by its largest square divisor.
 * @author Sean A. Irvine
 */
public class A055204 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
    mFactor.factor(mFactorSequence);
    return mFactorSequence.core();
  }
}
