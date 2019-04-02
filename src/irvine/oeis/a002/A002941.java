package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002941 Arrays of dumbbells.
 * @author Sean A. Irvine
 */
public class A002941 extends A002940 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = mC.multiply2().subtract(mA).add(mPrev).add(t);
    mA = mB;
    mB = mC;
    mC = r;
    mPrev = t;
    return r;
  }
}
