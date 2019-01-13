package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006398.
 * @author Sean A. Irvine
 */
public class A006398 extends A006399 {

  @Override
  public Z next() {
    planarCount(1, ++mN, 1, mN, mVerbose);
    return Z.valueOf(mTotalSensed);
  }
}
