package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065342 Triangle of sum of two primes: prime(n)+prime(k) with n &gt;= k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A065342 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mQ = 1;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    if (mQ > mP) {
      mP = mPrime.nextPrime(mP);
      mQ = 2;
    }
    return Z.valueOf(mP + mQ);
  }
}
