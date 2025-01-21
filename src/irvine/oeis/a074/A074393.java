package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074393 Number of primes between sigma(n) and phi(n) exclusive.
 * @author Sean A. Irvine
 */
public class A074393 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z phi = fs.phi();
    final Z sigma = fs.sigma();
    long cnt = 0;
    for (Z k = mPrime.nextPrime(phi); k.compareTo(sigma) < 0; k = mPrime.nextPrime(k)) {
      ++cnt;
    }
    if (sigma.isProbablePrime()) {
      --cnt;
    }
    return Z.valueOf(cnt);
  }
}
