package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032340 Number of identity bracelets with n labeled beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032340 extends A032242 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
