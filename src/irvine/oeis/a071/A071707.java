package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071707 Numbers k that divide tau(k)*sigma(k).
 * @author Sean A. Irvine
 */
public class A071707 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().multiply(fs.sigma0()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
