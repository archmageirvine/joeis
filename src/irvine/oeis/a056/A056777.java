package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056777 Composite numbers k such that both phi(k+12) = phi(k) + 12 and sigma(k+12) = sigma(k) + 12.
 * @author Sean A. Irvine
 */
public class A056777 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fsA = Cheetah.factor(mN + 12);
        final FactorSequence fsB = Cheetah.factor(mN);
        if (fsA.phi().equals(fsB.phi().add(12)) && fsA.sigma().equals(fsB.sigma().add(12))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
