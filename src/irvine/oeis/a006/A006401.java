package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006401 Number of unsensed simple planar maps with n edges and without vertices of degree 1.
 * @author Sean A. Irvine
 */
public class A006401 extends A006400 {

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(planarCount(2, mN, 1, mN, mVerbose));
  }
}
