package irvine.oeis.a065;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065886 Smallest square divisible by n!.
 * @author Sean A. Irvine
 */
public class A065886 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mFactorSequence.add(mN, FactorSequence.UNKNOWN);
      mFactor.factor(mFactorSequence);
    }
    Z s = Z.ONE;
    for (final Z p : mFactorSequence.toZArray()) {
      s = s.multiply(p.pow((mFactorSequence.getExponent(p) + 1) & ~1));
    }
    return s;
  }
}
