package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081617 Smallest k such that (product of first n primes)*k+1 is divisible by the (n+1)-th prime. Also (A075306(n)-1)/A002110(n).
 * @author Sean A. Irvine
 */
public class A081617 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    long k = 0;
    long p = 1;
    long prod = 1;
    for (long j = 0; j < mN; ++j) {
      p = mPrime.nextPrime(p);
      prod *= p;
      prod %= mP;
    }
    while (true) {
      if ((prod * ++k) % mP == mP - 1) {
        return Z.valueOf(k);
      }
    }
  }
}
