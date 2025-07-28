package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079023 Let p and q be two prime numbers, not necessarily consecutive, such that q - p = 2n; then a(n) is the number of partitions of 2n into even numbers so that each partition corresponds to a consecutive prime difference pattern (k-tuple) and p &lt;= A000230(n).
 * @author Sean A. Irvine
 */
public class A079023 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    long cnt = 0;
    while (true) {
      p = mFast.nextPrime(p);
      if (mFast.isPrime(p + mN)) {
        ++cnt;
        if (mFast.nextPrime(p) == p + mN) {
          return Z.valueOf(cnt);
        }
      }
    }
  }
}
