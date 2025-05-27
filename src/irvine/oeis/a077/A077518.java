package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077518 a(n) = A077517(n+1)/A077517(n).
 * @author Sean A. Irvine
 */
public class A077518 extends A077517 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
