package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053038 The first (largest) power of 2 arising in the iteration-sequence when A051953 (the cototient function) is repeatedly applied starting with n!.
 * @author Sean A. Irvine
 */
public class A053038 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mF = Z.ONE;
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    mF = mF.multiply(mN);
    if (mN <= 2) {
      return Z.valueOf(mN);
    }
    FactorSequence fs = mFactorSequence;
    Z s = mF;
    do {
      s = s.subtract(fs.phi());
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s.makeOdd()));
    return s;
  }
}
