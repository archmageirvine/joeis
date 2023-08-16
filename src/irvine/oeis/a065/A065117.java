package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A065117 Primes such that prime(p) +- pi(p) are simultaneously prime.
 * @author Sean A. Irvine
 */
public class A065117 extends A000720 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final Z pi = super.next();
      if (mPrime.isPrime(mN) && pi.add(mP).isProbablePrime() && pi.negate().add(mP).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

