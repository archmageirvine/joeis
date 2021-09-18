package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051542 Quotients of consecutive values of LCM {b(1),...,b(n)}, b() = A000330.
 * @author Sean A. Irvine
 */
public class A051542 extends A051538 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
