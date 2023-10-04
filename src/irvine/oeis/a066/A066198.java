package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066198 Numbers n where phi changes as fast as sigma, i.e., abs(phi(n+1) - phi(n)) = abs(sigma(n+1) - sigma(n)).
 * @author Sean A. Irvine
 */
public class A066198 extends Sequence1 {

  private long mN = 1;
  private FactorSequence mFactorSequence = Jaguar.factor(1);

  @Override
  public Z next() {
    while (true) {
      final FactorSequence t = mFactorSequence;
      mFactorSequence = Jaguar.factor(++mN);
      if (t.phi().subtract(mFactorSequence.phi()).abs().equals(t.sigma().subtract(mFactorSequence.sigma()).abs())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
