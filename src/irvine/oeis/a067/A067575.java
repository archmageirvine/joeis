package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067575 Numbers k that divide phi(k)*bigomega(k).
 * @author Sean A. Irvine
 */
public class A067575 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(fs.bigOmega()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
