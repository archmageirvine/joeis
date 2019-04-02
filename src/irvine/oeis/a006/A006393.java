package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006393 Number of unsensed planar maps with n edges and without faces of degree 1 or 2.
 * @author Sean A. Irvine
 */
public class A006393 extends A006392 {

  private int mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN, 1, mN + 1, mVerbose));
  }
}
