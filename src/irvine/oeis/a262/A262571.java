package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A262571 Concatenation of the numbers from 2 to n.
 * @author Georg Fischer
 */
public class A262571 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mOmitted;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A262571() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param omitted number to be omitted
   */
  public A262571(final int offset, final int omitted) {
    mOffset = offset;
    mN = offset - 1;
    mOmitted = omitted;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == mOmitted) {
      ++mN;
    }
    mSb.setLength(0);
    for (int i = mOffset; i <= mN; ++i) {
      if (i != mOmitted) {
        mSb.append(String.valueOf(i));
      }
    }
    return new Z(mSb.toString());
  }
}
