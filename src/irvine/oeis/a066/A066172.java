package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066172 Numbers k such that phi(k+1) - phi(k) = -d(k).
 * @author Sean A. Irvine
 */
public class A066172 extends Sequence1 {

  private FactorSequence mFactorSequence = Jaguar.factor(5);
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z t = mFactorSequence.phi().subtract(mFactorSequence.sigma0());
      mFactorSequence = Jaguar.factor(++mN);
      if (t.equals(mFactorSequence.phi())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
