package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006401 Number of connected planar maps without vertices of degree 1.
 * @author Sean A. Irvine
 */
public class A006401 extends A006400 {

  {
    setOffset(3);
  }

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN, 1, mN, mVerbose));
  }
}
