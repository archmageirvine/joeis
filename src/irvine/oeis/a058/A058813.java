package irvine.oeis.a058;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058813 Unlabeled (i.e., equivalent to their 1-0 complement) binary necklaces sorted in ascending lexicographic order and read as binary numbers.
 * @author Sean A. Irvine
 */
public class A058813 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private int mN = 0;
  private long mMask = 0;

  private boolean isCanonicalRotate(final long necklace, final long n) {
    long m = n;
    for (int rotate = 1; rotate <= mN; ++rotate) {
      m <<= 1;
      if (m > mMask) {
        ++m;
      }
      m &= mMask;
      if (m < necklace) {
        return false;
      }
    }
    return true;
  }

  private boolean isCanonical(final long necklace) {
    if (2 * Long.bitCount(necklace) > mN) {
      // Too many 1's to be canonical
      return false;
    }
    return isCanonicalRotate(necklace, necklace) && isCanonicalRotate(necklace, ~necklace & mMask);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 1) {
        mA.add(0L);
      } else {
        mMask = (1L << mN) - 1;
        final long limit = 1L << (mN - 1); // assume leading 0
        for (long k = 0; k < limit; ++k) {
          if (isCanonical(k)) {
            mA.add(k);
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
