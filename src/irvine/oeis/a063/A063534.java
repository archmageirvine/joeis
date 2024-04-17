package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063534 Numbers k such that C(k) = H(k) + d(k), where C(k) is Chowla's function A048050, H(k) is the half-totient function A023022 and d(k) is the number of divisors function A000005.
 * @author Sean A. Irvine
 */
public class A063534 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(mN + 1).equals(fs.phi().divide2().add(fs.sigma0()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
