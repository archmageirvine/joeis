package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032339 Number of identity bracelets with n labeled beads of 4 colors.
 * @author Sean A. Irvine
 */
public class A032339 extends A032241 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
