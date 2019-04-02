package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006394 Number of connected planar maps with n nodes and without loops or parallel edges.
 * @author Sean A. Irvine
 */
public class A006394 extends A006395 {

  @Override
  public Z next() {
    planarCount(1, ++mN, 1, mN + 1, mVerbose);
    return Z.valueOf(mTotalSensed);
  }
}
