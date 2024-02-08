package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068306 Numbers n such that n*tau(n) &lt; sigma(n)*bigomega(n) where tau(n)=A000005(n), sigma(n)=A000203(n), and bigomega(n)=A001222(n).
 * @author Sean A. Irvine
 */
public class A068306 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(mN).compareTo(fs.sigma().multiply(fs.bigOmega())) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
