package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131835 Numbers starting with 1.
 * @author Georg Fischer
 */
public class A131835 implements Sequence {

  protected Z mStart;
  protected Z mCurr;
  protected Z mEnd;

  /** Construct the sequence. */
  public A131835() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param start
   */
  public A131835(final int start) {
    mStart = Z.valueOf(start);
    mEnd = mStart.add(1);
    mCurr = mStart.subtract(1);
  }

  @Override
  public Z next() {
    while (true) {
      mCurr = mCurr.add(1);
      if (mCurr.compareTo(mEnd) < 0) {
        return mCurr;
      } else {
        mStart = mStart.multiply(10);
        mEnd = mEnd.multiply(10);
        mCurr = mStart;
        return mCurr;
      }
    }
  }
}
