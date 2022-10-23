package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011775 Numbers k such that k divides phi(k) * sigma(k).
 * @author Sean A. Irvine
 */
public class A011775 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Jaguar.factor(mN);
        if (fs.sigma().multiply(fs.phi()).mod(mN) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
