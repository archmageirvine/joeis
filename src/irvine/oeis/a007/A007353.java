package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007353 Where prime race among <code>5n+1, </code>..., <code>5n+4</code> changes leader.
 * @author Sean A. Irvine
 */
public class A007353 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();
  private long[] mCount = new long[size()];
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
