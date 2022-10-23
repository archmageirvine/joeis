package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056013 Numbers n such that n | sigma(n) - d(n) + phi(n).
 * @author Sean A. Irvine
 */
public class A056013 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.sigma0()).add(fs.phi()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
