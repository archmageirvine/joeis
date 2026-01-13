package irvine.math.z;

import irvine.oeis.Sequence1;

/**
 * Generate all palindromes of a given length in numerical order
 * @author Sean A. Irvine
 */
public final class LengthPalindromes extends Sequence1 {

  private final boolean mEven;
  private final Z mLim;
  private Z mLeft;
  private long mMid = 0;

  /**
   * Construct a sequence of nonzero palindromes of given length.
   * @param length length of palindromes
   */
  public LengthPalindromes(final int length) {
    mEven = (length & 1) == 0;
    final int h = length / 2 - 1;
    if (length == 1) {
      mLeft = null;
      mLim = null;
    } else if (h < 0) {
      mLeft = Z.ZERO;
      mLim = Z.ONE;
    } else {
      mLeft = new Z("1" + "0".repeat(h));
      mLim = mLeft.multiply(10);
    }
  }

  @Override
  public Z next() {
    if (mLeft == null) {
      if (++mMid >= 10) {
        return null;
      }
      return Z.valueOf(mMid);
    }
    if (mLeft.equals(mLim)) {
      return null;
    }
    final String left = mLeft.toString();
    final Z res;
    if (mEven) {
      res = new Z(left + new StringBuilder(left).reverse());
      mLeft = mLeft.add(1);
    } else {
      res = new Z(left + mMid + new StringBuilder(left).reverse());
      if (++mMid == 10) {
        mLeft = mLeft.add(1);
        mMid = 0;
      }
    }
    return res;
  }
}
