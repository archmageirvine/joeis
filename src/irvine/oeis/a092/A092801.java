package irvine.oeis.a092;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092801 Standard deviation (rounded) of composites below 10^n.
 * @author Sean A. Irvine
 */
public class A092801 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mLimit = 10;
  private long mCount = 0;
  private Z mSum = Z.ZERO;
  private Z mSumSquares = Z.ZERO;

  private void update(final long v) {
    final Z n = Z.valueOf(v);
    mSum = mSum.add(n);
    mSumSquares = mSumSquares.add(n.square());
    ++mCount;
  }

  private Z sigma() {
    final Z c = Z.valueOf(mCount);
    final Q mean = new Q(mSum, c).square();
    final Q v = new Q(mSumSquares, c).subtract(mean);
    if (mVerbose) {
      System.out.println(v.num() + "/" + v.den());
    }
    return Z.valueOf((long) (Math.sqrt(v.toZ().doubleValue()) + 0.5));
  }

  @Override
  public Z next() {
    if (mLimit < 0) {
      throw new UnsupportedOperationException();
    }
    while (true) {
      if (++mN == mLimit) {
        final Z r = sigma();
        update(mN);
        mLimit *= 10;
        return r;
      }
      if (!mPrime.isPrime(mN)) {
        update(mN);
      }
    }
  }
}

