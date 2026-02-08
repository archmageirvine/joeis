package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a072.A072999;

/**
 * A083698 Partial quotients of the continued fraction which has convergents with the least possible prime denominators (A072999).
 * @author Sean A. Irvine
 */
public class A083698 extends A072999 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return mA;
    }
    final Z t = mA;
    mA = super.next();
    return t.isZero() ? mA : mA.divide(t);
  }
}
