package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A061073 First occurrence of n consecutive n's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A061073 extends A000796 {

  private final StringBuilder mPi = new StringBuilder();
  private int mN = 0;
  private int mShift = 0;
  private int mNextShiftChange = 10;

  /** Construct the sequence. */
  public A061073() {
    super(1);
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).repeat(mN);
    if (mN == mNextShiftChange) {
      mNextShiftChange *= 10;
      ++mShift;
    }
    int start = 0;
    int pos;
    while ((pos = mPi.indexOf(s, start)) < 0) {
      start = mPi.length() - mShift;
      for (int k = 0; k < 100; ++k) {
        mPi.append(super.next());
      }
    }
    return Z.valueOf(pos + 1);
  }
}
