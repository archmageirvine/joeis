package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicLongArray;

/**
 * A076957 Smallest k such that there are exactly n primes strictly between k^2 and (k+1)^2.
 * @author Sean A. Irvine
 */
public class A076957 extends Sequence2 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long end = (++mM + 1) * (mM + 1);
      int cnt = 0;
      for (long p = mPrime.nextPrime(mM * mM); p < end; p = mPrime.nextPrime(p)) {
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

