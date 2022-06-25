package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A057679 Self-locating strings within Pi: numbers n such that the string n is at position n in the decimal digits of Pi, where 3 is the first digit.
 * @author Sean A. Irvine
 */
public class A057679 extends A000796 {

  // Verified this can produce at least the first 3 terms

  private long mValue = 0;
  private long mLim = 10;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        // We need to read ahead an extra digit
        mLim *= 10;
        mValue *= 10;
        mValue += super.next().longValue();
        mValue %= mLim;
      }
      mValue *= 10;
      mValue += super.next().longValue();
      mValue %= mLim;
      if (mValue == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
