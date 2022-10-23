package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A003468 Number of minimal 3-covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A003468 extends Sequence3 {

  private Z mSeven = Z.valueOf(49);
  private Z mSix = Z.valueOf(108);
  private Z mFive = Z.valueOf(75);
  private Z mFour = Z.valueOf(16);

  @Override
  public Z next() {
    mSeven = mSeven.multiply(7);
    mSix = mSix.multiply(6);
    mFive = mFive.multiply(5);
    mFour = mFour.shiftLeft(2);
    return mSeven.subtract(mSix).add(mFive).subtract(mFour).divide(6);
  }
}

