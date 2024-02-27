package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005236 Barriers for omega(n): numbers n such that, for all m &lt; n, m + omega(m) &lt;= n.
 * @author Sean A. Irvine
 */
public class A068597 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean isBarrier(final long n) {
    if (!mPrime.isPrime(n - 1) || !mPrime.isPrime(n / 2 - 1)) {
      return n < 5 && n > 1;
    }
    for (long m = 3; m <= LongUtils.log2(n); ++m) {
      if (Jaguar.factor(n - m).bigOmega() > m) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isBarrier(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
