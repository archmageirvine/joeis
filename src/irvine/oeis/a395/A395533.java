package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a237.A237271;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A395533 a(n) is the first occurrence k of an uninterrupted sequence of n adjacent center parts of the symmetric representation of sigma of i, SRS(i), i = k to i = k + n - 1 where each SRS(i) has an odd number of parts and SRS(k-1) and SRS(k+n) each have an even number of parts.
 * @author Sean A. Irvine
 */
public class A395533 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final DirectSequence mLengths = new A237271();
  private int mN = 0;
  private int mM = 0;
  private int mPrev = 0;
  private int mPrevLength = 0;

  private int size(final int n) {
    if (n == mPrev) {
      return mPrevLength;
    }
    mPrev = n;
    mPrevLength = mLengths.a(n).intValueExact();
    return mPrevLength;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      while ((size(++mM) & 1) == 0) {
        // do nothing
      }
      // mM is now the start of a run
      final long start = mM;
      while ((size(++mM) & 1) == 1) {
        // do nothing
      }
      // mM is now an even SRS
      final long len = mM - start;
      if (mFirsts.get(len) == 0) {
        mFirsts.set(len, start);
        if (mVerbose) {
          StringUtils.message("Solution for n=" + len + " is " + start);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
