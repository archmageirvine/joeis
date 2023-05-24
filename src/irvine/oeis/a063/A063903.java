package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063903 Numbers k such that ud(k)*phi(k) = sigma(k), ud(k) = A034444.
 * @author Sean A. Irvine
 */
public class A063903 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma0().multiply(fs.phi()).equals(fs.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
