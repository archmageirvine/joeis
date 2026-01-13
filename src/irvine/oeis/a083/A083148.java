package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083148 a(n) = A083147(n+1)/A083147(n).
 * @author Sean A. Irvine
 */
public class A083148 extends A083147 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

