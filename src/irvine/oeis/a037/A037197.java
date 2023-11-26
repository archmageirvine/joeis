package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037197 Numbers k such that tau(sigma(k)) = tau(k) where tau(k) is the number of divisors of k and sigma(k) their sum.
 * @author Sean A. Irvine
 */
public class A037197 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.sigma()).sigma0().equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
