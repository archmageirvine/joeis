package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063519 Least simultaneous solutions of Phi[x+d]=Phi[x]+d and Sigma[x+d]=Sigma[x]+d, where d=2n.
 * @author Sean A. Irvine
 */
public class A063519 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 12;
    long k = 0;
    while (true) {
      ++k;
      if (!mPrime.isPrime(k)) {
        final FactorSequence fs1 = Jaguar.factor(k);
        final FactorSequence fs2 = Jaguar.factor(mN + k);
        if (fs1.phi().add(mN).equals(fs2.phi()) && fs1.sigma().add(mN).equals(fs2.sigma())) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
