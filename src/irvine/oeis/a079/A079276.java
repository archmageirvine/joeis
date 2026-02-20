package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079276 Multiplicative inverse in the finite field F(prime(n)) of the product of the first n-1 primes modulo prime(n).
 * @author Sean A. Irvine
 */
public class A079276 extends Sequence1 {

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
    return Z.valueOf(LongUtils.modInverse(prod, mMod));
  }
}
