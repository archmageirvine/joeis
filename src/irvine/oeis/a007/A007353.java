package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007353 Where the prime race among 5k+1, ..., 5k+4 changes leader.
 * @author Sean A. Irvine
 */
public class A007353 extends Sequence1 {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();
  private final long[] mCount = new long[size()];
  private int mTop = 0;

  protected int size() {
    return 5;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      ++mCount[(int) mP.mod(mCount.length)];
      final long t = mCount[mTop];
      for (int k = 0; k < mCount.length; ++k) {
        if (k != mTop && mCount[k] > t) {
          mTop = k;
          return mP;
        }
      }
    }
  }
}
