package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056097 Numbers n such that phi(n) + 1 | sigma(n).
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
