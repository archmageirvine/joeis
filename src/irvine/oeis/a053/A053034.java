package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053034 Length of sequence when A051953 (cototient function) is repeatedly applied starting with n!.
 * @author Sean A. Irvine
 */
public class A053034 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mF = Z.ONE;
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    mF = mF.multiply(mN);
    long cnt = 1;
    FactorSequence fs = mFactorSequence;
    Z s = mF;
    do {
      ++cnt;
      s = s.subtract(fs.phi());
      fs = Jaguar.factor(s);
    } while (!s.isZero());
    return Z.valueOf(cnt);
  }
}
