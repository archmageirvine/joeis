package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A064674 Number of primes q such that phiter(q)=n where phiter(n)=A064415(n).
 * @author Sean A. Irvine
 */
public class A064674 extends Sequence0 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private final Sequence mA = new A064415();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mM = 0;
  private long mLim = 1;
  private int mN = -1;

  @Override
  public Z next() {
    if (mLim < 0) {
      throw new UnsupportedOperationException();
    }
    ++mN;
    while (true) {
      final int t = mA.next().intValueExact();
      if (++mM == mP) {
        mCounts.increment(t);
        mP = mPrime.nextPrime(mP);
        if (mM >= mLim) {
          mLim *= 3;
          return Z.valueOf(mCounts.get(mN));
        }
      }
    }
  }
}
