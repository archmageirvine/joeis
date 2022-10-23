package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054860 Number of ways of writing 2n+1 as p + q + r where p, q, r are primes with p &lt;= q &lt;= r.
 * @author Sean A. Irvine
 */
public class A054860 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long p = 2; 3 * p <= mN; p = mPrime.nextPrime(p)) {
      for (long q = p; p + 2 * q <= mN; q = mPrime.nextPrime(q)) {
        final long r = mN - p - q;
        if (mPrime.isPrime(r)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
