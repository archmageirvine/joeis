package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046927 Number of ways to express 2n+1 as p+2q where p and q are primes.
 * @author Sean A. Irvine
 */
public class A046927 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    int cnt = 0;
    for (long k = 2, p; (p = mN - 2 * k) > 0; k = mPrime.nextPrime(k)) {
      if (mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
