package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046922 Number of ways to express n as p+2a^2; p prime, a &gt;= 0.
 * @author Sean A. Irvine
 */
public class A046922 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (long k = 0, p; (p = mN - 2 * k * k) > 1; ++k) {
      if (mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
