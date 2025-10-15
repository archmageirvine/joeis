package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;
import irvine.util.array.DynamicLongArray;

/**
 * A387790 allocated for Zhi-Wei Sun.
 * @author Sean A. Irvine
 */
public class A387790 extends Sequence1 {

  private final DirectSequence mSumPrimes = DirectSequence.create(new A007504());
  private final DynamicLongArray mS = new DynamicLongArray();
  private long mN = 0;

  private long s(final int k) {
    while (k >= mS.length()) {
      mS.set(mS.length(), mSumPrimes.next().longValueExact());
    }
    return mS.get(k);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    int k = 0;
    while (2 * s(++k) < mN) {
      final long t = mN - 2 * s(k);
      int j = 0;
      while (2 * s(++j) <= t) {
        final long u = t - s(j);
        // u >= s(j)
        int i = j;
        while (s(i) <= u) {
          if (s(i) == u) {
            ++cnt;
          }
          ++i;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
