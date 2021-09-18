package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051552 Quotients of consecutive values of LCM {b(0), b(1) ...,b(n)}, b() = A016789.
 * @author Sean A. Irvine
 */
public class A051552 extends A051540 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
