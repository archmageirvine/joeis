package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064041 Number of divisors of A064040(n).
 * @author Sean A. Irvine
 */
public class A064041 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (mPrime.isPrime(fs.omega())) {
        return fs.sigma0();
      }
    }
  }
}
