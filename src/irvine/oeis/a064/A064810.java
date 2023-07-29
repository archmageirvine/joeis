package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A064810 Self-locating strings within Pi: numbers n such that the string n is at position n in the decimal digits of Pi, where 1 is the 0th digit.
 * @author Sean A. Irvine
 */
public class A064810 extends A000796 {

  private final StringBuilder mBuffer = new StringBuilder();
  private long mLim = 1;
  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10; // buffer needs to get one longer
        mBuffer.append(super.next());
      }
      mBuffer.deleteCharAt(0);
      mBuffer.append(super.next());
      if (mBuffer.indexOf(String.valueOf(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

