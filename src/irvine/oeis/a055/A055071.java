package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055071 Largest square dividing n!.
 * @author Sean A. Irvine
 */
public class A055071 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    Z prod = Z.ONE;
    for (final Z p : mFactorSequence.toZArray()) {
      final int e = mFactorSequence.getExponent(p) / 2;
      prod = prod.multiply(p.pow(e));
    }
    return prod.square();
  }
}

