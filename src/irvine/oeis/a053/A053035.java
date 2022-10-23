package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053035 Number of powers of 2 in the iteration-sequence when A051953 (cototient function) is repeatedly applied starting with n!.
 * @author Sean A. Irvine
 */
public class A053035 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mF = Z.ONE;
  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(mN)));
    mF = mF.multiply(mN);
    if (mN == 2) {
      return Z.TWO;
    }
    FactorSequence fs = mFactorSequence;
    Z s = mF;
    do {
      s = s.subtract(fs.phi());
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s.makeOdd()));
    return Z.valueOf(1 + s.auxiliary());
  }
}
