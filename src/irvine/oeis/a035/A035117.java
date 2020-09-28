package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A035117 a(n) is the starting position of the first occurrence of a string of at least n 1's in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A035117 extends A000796 {

  private int mN = 0;
  private long mM = -1;
  private int mLast = 0;
  private long mLastPos = 0;

  protected Z digit() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN < mLast) {
      return Z.valueOf(mLastPos);
    }
    while (true) {
      mLastPos = ++mM;
      mLast = 0;
      while (super.next().equals(digit())) {
        ++mM;
        ++mLast;
      }
      if (mLast >= mN) {
        return Z.valueOf(mLastPos);
      }
    }
  }
}
