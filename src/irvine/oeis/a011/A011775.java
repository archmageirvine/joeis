package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011775 Numbers n such that n divides phi(n) * sigma(n).
 * @author Sean A. Irvine
 */
public class A011775 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Cheetah.factor(mN);
        if (fs.sigma().multiply(fs.phi()).mod(mN) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
