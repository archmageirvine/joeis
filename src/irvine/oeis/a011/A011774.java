package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011774 Nonprimes n that divide <code>sigma(n) + phi(n)</code>.
 * @author Sean A. Irvine
 */
public class A011774 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Cheetah.factor(mN);
        if (fs.sigma().add(fs.phi()).mod(mN) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
