package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065305 Triangular array giving means of two odd primes: T(n,k) = (n-th prime + k-th prime)/2, n &gt;= k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A065305 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mQ = 2;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    if (mQ > mP) {
      mP = mPrime.nextPrime(mP);
      mQ = 3;
    }
    return Z.valueOf((mP + mQ) / 2);
  }
}
