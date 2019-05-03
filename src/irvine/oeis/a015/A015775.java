package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015775 Numbers n such that <code>(phi(n) + 1) | sigma(n + 1)</code>, where phi is Euler's totient function <code>A000010</code>.
 * @author Sean A. Irvine
 */
public class A015775 implements Sequence {

  private FactorSequence mFactorSequence = Cheetah.factor(1);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z phi1 = mFactorSequence.phi().add(1);
      mFactorSequence = Cheetah.factor(++mN);
      if (mFactorSequence.sigma().mod(phi1).equals(Z.ZERO)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
