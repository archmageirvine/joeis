package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051541 Quotients of consecutive values of LCM {1, 5, 9, 13, 17, ..., (4n+1)}.
 * @author Sean A. Irvine
 */
public class A051541 extends A051539 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
