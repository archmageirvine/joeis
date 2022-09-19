package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000179;

/**
 * A059375 Number of seating arrangements for the m\u00e9nage problem.
 * @author Sean A. Irvine
 */
public class A059375 extends A000179 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return t.multiply(mF).max(Z.ZERO).multiply2();
  }
}
