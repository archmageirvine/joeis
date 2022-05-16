package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055681 Numbers k that divide sigma(k)-phi(k).
 * @author Sean A. Irvine
 */
public class A055681 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.phi()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
