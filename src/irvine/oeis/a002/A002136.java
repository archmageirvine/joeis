package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002136 Matrices with 2 rows.
 * @author Sean A. Irvine
 */
public class A002136 extends A002135 {

  private Z mPP = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    super.next();
    final Z t = mB.multiply(mN).add(mC).add(mPP.multiply(mN).multiply(mN - 1));
    mPP = mP;
    mP = t;
    return mP;
  }
}
