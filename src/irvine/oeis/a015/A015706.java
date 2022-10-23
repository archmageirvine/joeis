package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015706 Odd numbers k that divide phi(k)*sigma(k).
 * @author Sean A. Irvine
 */
public class A015706 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      if (a.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
