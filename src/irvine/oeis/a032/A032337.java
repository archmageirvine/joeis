package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032337 Number of identity bracelets with n labeled beads of 2 colors.
 * @author Sean A. Irvine
 */
public class A032337 extends A032239 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
