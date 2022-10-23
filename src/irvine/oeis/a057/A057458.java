package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057458 Number of k, 1 &lt;= k &lt;= n, where {k (n+1-k) + 1} is prime.
 * @author Sean A. Irvine
 */
public class A057458 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (mPrime.isPrime(k * (mN - k) + 1)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
