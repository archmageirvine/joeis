package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A059316 Least integer m such that between m and 2m (including endpoints) there are exactly n primes.
 * @author Sean A. Irvine
 */
public class A059316 extends Sequence1 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      ++mM;
      int cnt = 0;
      for (long p = mPrime.nextPrime(mM - 1); p <= 2 * mM; p = mPrime.nextPrime(p)) {
        ++cnt;
      }
      if (mA.get(cnt) == 0) {
        mA.set(cnt, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
