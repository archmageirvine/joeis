package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007508 Number of twin prime pairs below 10^n.
 * @author Sean A. Irvine
 */
public class A007508 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private long mLimit = 1;
  private long mCount = 0;

  protected long base() {
    return 10;
  }

  @Override
  public Z next() {
    mLimit *= base();
    while (mP < mLimit) {
      final long t = mPrime.nextPrime(mP);
      if (t - mP == 2) {
        ++mCount;
      }
      mP = t;
    }
    return Z.valueOf(mCount);
  }
}
