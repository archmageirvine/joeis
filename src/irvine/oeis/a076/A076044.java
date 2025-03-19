package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A076044 Largest a(n) values with at most n primes between a(n) and a(n)+sqrt(a(n)) inclusive.
 * @author Sean A. Irvine
 */
public class A076044 extends Sequence0 {

  private static final long HEURISTIC = 100000;
  private final Fast mPrime = new Fast();
  private final DynamicLongArray mLasts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  private int count(final long m) {
    final long upper = m + Functions.CEIL_SQRT.l(m);
    int cnt = 0;
    for (long p = mPrime.nextPrime(m - 1); p < upper; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mLasts.get(mN) + HEURISTIC * (mN + 1) > mM) {
      final int cnt = count(++mM);
      if (cnt < mN) {
        throw new RuntimeException("Heuristic failed: a(" + cnt + ") should have been at least " + mM);
      }
      mLasts.set(cnt, mM);
    }
    return Z.valueOf(mLasts.get(mN));
  }
}
