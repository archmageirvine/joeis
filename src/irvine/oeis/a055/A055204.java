package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055204 Squarefree part of n!: n! divided by its largest square divisor.
 * @author Sean A. Irvine
 */
public class A055204 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
    mFactor.factor(mFactorSequence);
    Z core = Z.ONE;
    for (final Z p : mFactorSequence.toZArray()) {
      if ((mFactorSequence.getExponent(p) & 1) == 1) {
        core = core.multiply(p);
      }
    }
    return core;
  }
}
