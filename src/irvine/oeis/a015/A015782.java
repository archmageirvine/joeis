package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015782 Phi(n) <code>+ 3</code> | <code>sigma(n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A015782 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z phi3 = mFactorSequenceA.phi().add(3);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = Cheetah.factor(++mN);
      if (mFactorSequenceC.sigma().mod(phi3).equals(Z.ZERO)) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
