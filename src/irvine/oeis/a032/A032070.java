package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032070 Number of reversible strings with n labeled beads of 3 colors, no palindromes of more than 1 bead.
 * @author Sean A. Irvine
 */
public class A032070 extends A032086 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
