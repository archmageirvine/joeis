package irvine.oeis.a232;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A232191 A walk based on the digits of Pi (A000796).
 * @author Georg Fischer
 */
public class A232191 extends A000796 {

  protected int mNext;
  protected int mCurr;

  /** Construct the sequence. */
  public A232191() {
    mNext = super.next().intValue();
    mCurr = mNext - 1;
  }

  @Override
  public Z next() {
    if (mCurr > mNext) {
      --mCurr;
    } else if (mCurr < mNext) {
      ++mCurr;
    } else { // ==
      mNext = super.next().intValue();
      if (mCurr > mNext) {
        --mCurr;
      } else if (mCurr < mNext) {
        ++mCurr;
      }
    }
    return Z.valueOf(mCurr);
  }
}
