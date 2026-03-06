package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a062.A062964;

/**
 * A392198 allocated for James S. DeArmon.
 * @author Sean A. Irvine
 */
public class A392198 extends Sequence0 {

  private static final String DIGITS = "0123456789abcdef";
  private final Sequence mSeq;
  private final StringBuilder mPi = new StringBuilder();
  private int mN = -1;
  private int mShift = 0;
  private int mNextShiftChange = 10;

  protected A392198(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A392198() {
    this(new A062964());
  }

  @Override
  public Z next() {
    final String s = Integer.toString(++mN, 16);
    if (mN == mNextShiftChange) {
      mNextShiftChange *= 10;
      ++mShift;
    }
    int start = 0;
    int pos;
    while ((pos = mPi.indexOf(s, start)) < 0) {
      start = mPi.length() - mShift;
      for (int k = 0; k < 100; ++k) {
        mPi.append(DIGITS.charAt(mSeq.next().intValue()));
      }
    }
    return Z.valueOf(pos);
  }
}
