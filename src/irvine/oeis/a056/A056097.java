package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056097 Numbers k such that phi(k) + 1 | sigma(k).
 * @author Sean A. Irvine
 */
public class A056097 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
