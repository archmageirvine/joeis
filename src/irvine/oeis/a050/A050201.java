package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;
import irvine.util.string.StringUtils;

/**
 * A050201 Starting positions of strings of 2 0's in the decimal expansion of Pi.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A050201 extends A000796 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int mOccur;
  private final int mDigit;
  private int mCount;
  private int mPos;
  private boolean mState;

  /** Construct the sequence. */
  public A050201() {
    this(2, 0);
  }
  
  /**
   * Generic constructor with parameters.
   * @param occurrences number of occurrences required
   * @param digit desired digit
   */
  public A050201(final int occurrences, final int digit) {
    mOccur = occurrences;
    mDigit = digit;
    mCount = 0;
    mPos = 0;
    mState = true;
  }

  @Override
  public Z next() {
    while (true) {
      if (mState) {
        final int digit = super.next().intValue();
        ++mPos;
        if (digit == mDigit) {
          mCount = 1;
          mState = false;
        }
      } else {
        if (mCount >= mOccur) {
          mCount = mOccur - 1;
          return Z.valueOf(mPos - mOccur);
        } else {
          final int digit = super.next().intValue();
          ++mPos;
          if (digit == mDigit) {
            ++mCount;
          } else {
            mState = true;
          }
        }
      }
      if (mVerbose && mPos % 100000 == 0) {
        StringUtils.message("Search completed to " + mPos);
      }
    }
  }
}
