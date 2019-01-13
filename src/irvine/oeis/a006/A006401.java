package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006401.
 * @author Sean A. Irvine
 */
public class A006401 extends A006400 {

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN + 1, 1, mN + 1, mVerbose));
  }
}
