package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056076 Numbers k that divide sigma(k) + d(k), where d(k) is the number of divisors of k and sigma(k) is their sum.
 * @author Sean A. Irvine
 */
public class A056076 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().add(fs.sigma0()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
