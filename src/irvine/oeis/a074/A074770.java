package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074770 Numbers n such that tau(n) &gt; tau(n+1), phi(n) &gt; phi(n+1) and sigma(n) &gt; sigma(n+1).
 * @author Sean A. Irvine
 */
public class A074770 extends Sequence1 {

  private FactorSequence mFactorSequence = Jaguar.factor(45);
  private long mN = 45;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = mFactorSequence;
      mFactorSequence = Jaguar.factor(++mN);
      if (fs.sigma0().compareTo(mFactorSequence.sigma0()) > 0
        && fs.phi().compareTo(mFactorSequence.phi()) > 0
        && fs.sigma().compareTo(mFactorSequence.sigma()) > 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
