package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055230 Greatest common divisor of largest square dividing n! and squarefree part of n!.
 * @author Sean A. Irvine
 */
public class A055230 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
    mFactor.factor(mFactorSequence);
    Z prod = Z.ONE;
    for (final Z p : mFactorSequence.toZArray()) {
      final int e = mFactorSequence.getExponent(p);
      if (e > 1 && (e & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
