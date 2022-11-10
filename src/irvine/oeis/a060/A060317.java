package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060317 a(n) = n * next number greater than n with same first digit as n.
 * @author Sean A. Irvine
 */
public class A060317 extends Sequence1 {

  private long mN = 0;
  private long mDiv = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mDiv = mLim;
      mLim *= 10;
    }
    final long firstDigit = mN / mDiv;
    if ((mN + 1) / mDiv == firstDigit) {
      return Z.valueOf(mN + 1).multiply(mN);
    } else {
      return Z.valueOf(firstDigit * mLim).multiply(mN);
    }
  }
}
