package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015781 Phi(n) <code>+ 2</code> | sigma(n <code>+ 2)</code>.
 * @author Sean A. Irvine
 */
public class A015781 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z phi2 = mFactorSequenceA.phi().add(2);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = Cheetah.factor(++mN);
      if (mFactorSequenceB.sigma().mod(phi2).equals(Z.ZERO)) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
