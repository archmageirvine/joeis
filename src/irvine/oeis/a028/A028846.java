package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028846 Numbers whose product of digits is a power of 2.
 * @author Sean A. Irvine
 */
public class A028846 extends Sequence1 {

  private long mN = 3;
  private long mLim = 8;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 4;
      mN = mLim / 2;
    }
    return new Z(Long.toString(mN, 4).substring(1).replace('3', '8').replace('2', '4').replace('1', '2').replace('0', '1'));
  }
}
