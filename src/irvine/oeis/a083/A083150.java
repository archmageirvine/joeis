package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083150 a(n) = A083149(n+1)/A083149(n).
 * @author Sean A. Irvine
 */
public class A083150 extends A083149 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

