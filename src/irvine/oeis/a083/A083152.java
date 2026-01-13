package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083152 a(n) = A083151(n+1)/A083151(n).
 * @author Sean A. Irvine
 */
public class A083152 extends A083151 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

