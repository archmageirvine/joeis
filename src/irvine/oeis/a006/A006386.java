package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006386 Number of unrooted maps with n edges on the torus.
 * @author Sean A. Irvine
 */
public class A006386 extends A006387 {

  private int mN = 1;

  @Override
  public Z next() {
    count(1, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSums[1]);
  }
}
