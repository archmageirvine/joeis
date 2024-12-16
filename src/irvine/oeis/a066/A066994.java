package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066994 Numbers k such that phi(k) divides k*sigma(k).
 * @author Sean A. Irvine
 */
public class A066994 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().multiply(mN).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

