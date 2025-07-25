package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000796;

/**
 * A014777 Position of the start of the first occurrence of n after the decimal point in Pi = 3.14159265358979323846264338327950288...
 * @author Sean A. Irvine
 */
public class A014777 extends Sequence0 {

  private final Sequence mSeq;
  private final StringBuilder mPi = new StringBuilder();
  private int mN = -1;
  private int mShift = 0;
  private int mNextShiftChange = 10;

  protected A014777(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A014777() {
    this(new A000796().skip());
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    if (mN == mNextShiftChange) {
      mNextShiftChange *= 10;
      ++mShift;
    }
    int start = 0;
    int pos;
    while ((pos = mPi.indexOf(s, start)) < 0) {
      start = mPi.length() - mShift;
      for (int k = 0; k < 100; ++k) {
        mPi.append(mSeq.next());
      }
    }
    return Z.valueOf(pos + 1);
  }
}
