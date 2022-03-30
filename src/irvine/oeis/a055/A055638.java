package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Factorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055638 Numbers n for which sigma(n^2) is prime.
 * @author Sean A. Irvine
 */
public class A055638 implements Sequence {

  private Z mN = Z.ONE;
  private final Factorizer mFactor = new Cheetah();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = new FactorSequence();
      fs.add(mN, FactorSequence.UNKNOWN, 2);
      mFactor.factor(fs);
      if (fs.sigma().isProbablePrime()) {
        return mN;
      }
    }
  }
}

