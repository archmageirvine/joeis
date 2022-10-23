package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A054203 Smallest primes followed by n consecutive (unequal) prime differences, each divided by 6.
 * @author Sean A. Irvine
 */
public class A054203 extends Sequence1 {

  private final DynamicLongArray mFirst = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private int mN = 0;

  private int cnt(long p) {
    if ((p - mPrime.prevPrime(p)) % 6 == 0) {
      return 0;
    }
    int cnt = 0;
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if ((p - q) % 6 != 0) {
        return cnt;
      }
      ++cnt;
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final int cnt = cnt(mP);
      if (mFirst.get(cnt) == 0) {
        mFirst.set(cnt, mP);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}

