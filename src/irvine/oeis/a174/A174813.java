package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A174813 a(n) = number whose product of digits equals a power of 3.
 * @author Sean A. Irvine
 */
public class A174813 extends Sequence1 {

  private long mN = 2;
  private long mLim = 6;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 3;
      mN = mLim / 2;
    }
    return new Z(Long.toString(mN, 3).substring(1).replace('2', '9').replace('1', '3').replace('0', '1'));
  }
}
