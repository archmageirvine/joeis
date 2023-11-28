package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066995 Numbers k such that sigma(k) divides k*phi(k).
 * @author Sean A. Irvine
 */
public class A066995 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(mN).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

