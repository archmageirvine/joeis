package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006397.
 * @author Sean A. Irvine
 */
public class A006397 extends A006396 {

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN + 1, 1, mN + 1, mVerbose));
  }
}
