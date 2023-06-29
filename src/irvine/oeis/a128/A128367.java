package irvine.oeis.a128;
// manually 2021-09-29

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A128367 a(n) = least k such that the remainder when 27^k is divided by k is n.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A128367 extends AbstractSequence {

  protected int mParm;
  private final long[] mCache = new long[1000000];
  protected int mN;
  private long mK = 0;

  /** Construct the sequence. */
  public A128367() {
    this(1, 27);
  }

  /**
   * Generic constructor with parameter
   * @param offset index of first term
   * @param parm parameter
   */
  public A128367(final int offset, final int parm) {
    super(offset);
    mN = offset - 1;
    mParm = parm;
  }

  @Override
  public Z next() {
    if (++mN >= mCache.length) {
      throw new UnsupportedOperationException();
    }
    while (mCache[mN] == 0) {
      final long r;
      if (++mK < LongUtils.MODLIMIT) {
        r = LongUtils.modPow(mParm, mK, mK);
      } else {
        final Z k = Z.valueOf(mK);
        r = Z.valueOf(mParm).modPow(k, k).longValue();
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
