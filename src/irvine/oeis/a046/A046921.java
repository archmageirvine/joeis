package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046921 Number of ways to express 2n+1 as p+2a^2; p = 1 or prime, a &gt;= 0.
 * @author Sean A. Irvine
 */
public class A046921 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    int cnt = 0;
    for (long k = 0, p; (p = mN - 2 * k * k) > 0; ++k) {
      if (p == 1 || mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
