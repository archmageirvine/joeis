package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006472 a(n) = n!*(n-1)!/2^(n-1).
 * @author Sean A. Irvine
 */
public class A006472 extends Sequence1 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mF).multiply(mN + 1).shiftRight(mN);
  }
}
