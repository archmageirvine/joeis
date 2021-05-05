package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046920 Number of ways to express n as p+2a^2; p = 1 or prime, a &gt;= 0.
 * @author Sean A. Irvine
 */
public class A046920 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (long k = 0, p; (p = mN - 2 * k * k) > 0; ++k) {
      if (p == 1 || mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
