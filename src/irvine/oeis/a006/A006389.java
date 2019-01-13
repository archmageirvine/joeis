package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006389.
 * @author Sean A. Irvine
 */
public class A006389 extends A006388 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(planarCount(2, ++mN, 1, mN + 1, mVerbose));
  }
}
