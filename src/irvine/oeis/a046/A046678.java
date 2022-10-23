package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046678 Number of divisors of n and sum of divisors of n are relatively prime.
 * @author Sean A. Irvine
 */
public class A046678 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Z.ONE.equals(fs.sigma().gcd(fs.sigma0()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
