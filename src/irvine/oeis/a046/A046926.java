package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046926 Number of ways to express n as p+2q; p, q primes.
 * @author Sean A. Irvine
 */
public class A046926 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (long k = 2, p; (p = mN - 2 * k) > 0; k = mPrime.nextPrime(k)) {
      if (mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
