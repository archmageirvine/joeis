package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032072 Number of reversible strings with n labeled beads of 5 colors, no palindromes of more than 1 bead.
 * @author Sean A. Irvine
 */
public class A032072 extends A032088 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return super.next().multiply(mF);
  }
}
