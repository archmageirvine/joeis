package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080356 Number of twin primes between n and 2n: a(n) = number of j in range n &lt;= j &lt;= 2*n such that j and j+2 are primes.
 * @author Sean A. Irvine
 */
public class A080356 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = mPrime.nextPrime(mN - 1); p <= 2 * mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(p + 2)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
