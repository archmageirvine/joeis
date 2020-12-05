package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036997 Number of composite numbers &lt;= n and relatively prime to n.
 * @author Sean A. Irvine
 */
public class A036997 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 4; k <= mN; ++k) {
      if (!mPrime.isPrime(k) && LongUtils.gcd(k, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
