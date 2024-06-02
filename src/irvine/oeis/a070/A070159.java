package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070159 Numbers k such that phi(k)/(sigma(k)-k) is an integer.
 * @author Sean A. Irvine
 */
public class A070159 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().mod(fs.sigma().subtract(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
