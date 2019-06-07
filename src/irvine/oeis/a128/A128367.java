package irvine.oeis.a128;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A128367 <code>a(n) =</code> least k such that the remainder when <code>27^k</code> is divided by k is <code>n</code>.
 * @author Sean A. Irvine
 */
public class A128367 implements Sequence {

  private final long[] mCache = new long[1000000];
  private int mN = 0;
  private long mK = 0;
  private static final Z TWENTY_SEVEN = Z.valueOf(27);

  @Override
  public Z next() {
    if (++mN >= mCache.length) {
      throw new UnsupportedOperationException();
    }
    while (mCache[mN] == 0) {
      final long r;
      if (++mK < LongUtils.MODLIMIT) {
        r = LongUtils.modPow(27, mK, mK);
      } else {
        final Z k = Z.valueOf(mK);
        r = TWENTY_SEVEN.modPow(k, k).longValue();
      }
      if (r < mCache.length) {
        final int rr = (int) r;
        if (mCache[rr] == 0) {
          mCache[rr] = mK;
        }
      }
    }
    return Z.valueOf(mCache[mN]);
  }
}
