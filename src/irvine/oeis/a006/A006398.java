package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006398 Number of sensed planar maps with n edges and without loops or isthmuses.
 * @author Sean A. Irvine
 */
public class A006398 extends A006399 {

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    planarCount(1, mN, 1, mN, mVerbose);
    return Z.valueOf(mTotalSensed);
  }
}
