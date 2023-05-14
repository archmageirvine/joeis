package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063788 Numbers k such that sigma(k) = 2k + Omega(k), where Omega(n) is the number of prime divisors of n (with repetition).
 * @author Sean A. Irvine
 */
public class A063788 extends Sequence1 {

  private long mN = 17;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Z.valueOf(2 * mN + fs.bigOmega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
