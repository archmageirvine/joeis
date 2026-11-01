package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.util.array.DynamicLongArray;

/**
 * A087187 Number of ways to write n = i*p + j*q, where (p,q) is a twin prime pair and i,j&gt;0.
 * @author Sean A. Irvine
 */
public class A087187 extends Sequence1 {

  private long mN = 0;
  private final DynamicLongArray mLesserTwins = new DynamicLongArray();
  private final Sequence mT = new A001359();

  private long t(final int k) {
    while (k >= mLesserTwins.length()) {
      mLesserTwins.set(mLesserTwins.length(), mT.next().longValueExact());
    }
    return mLesserTwins.get(k);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    int k = -1;
    while (true) {
      final long p = t(++k);
      final long q = p + 2;
      if (p + q > mN) {
        break;
      }
      for (long i = p; i < mN; i += p) {
        if ((mN - i) % q == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
