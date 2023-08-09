package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;
import irvine.util.array.DynamicLongArray;

/**
 * A065044 Start of the first run of exactly n consecutive primes, none of which are twin primes.
 * @author Sean A. Irvine
 */
public class A065044 extends A001359 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mNextTwin = super.next().longValueExact();
  private long mP = 2;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      int k = 0;
      final long s = mP;
      while (mP < mNextTwin) {
        ++k;
        mP = mPrime.nextPrime(mP);
      }
      if (mFirsts.get(k) == 0) {
        mFirsts.set(k, s);
      }
      mP = mPrime.nextPrime(mPrime.nextPrime(mP));
      mNextTwin = super.next().longValueExact();
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

