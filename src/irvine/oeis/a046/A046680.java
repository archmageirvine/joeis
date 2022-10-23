package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046680 Numbers k such that the number of divisors of k and sum of cubes of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046680 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Z.ONE.equals(fs.sigma0().gcd(fs.sigma(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
