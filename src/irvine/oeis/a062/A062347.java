package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062347 a(n) = (product of first n primes) modulo prime(n+1).
 * @author Sean A. Irvine
 */
public class A062347 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mMod = 0;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    mMod = mPrime.nextPrime(mMod);
    long prod = 1;
    for (long k = 0, p = 2; k < mN; ++k, p = mPrime.nextPrime(p)) {
      prod *= p;
      prod %= mMod;
    }
    return Z.valueOf(prod);
  }
}
