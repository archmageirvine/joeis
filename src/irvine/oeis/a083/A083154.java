package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083154 a(n) = A083153(n+1)/A083153(n).
 * @author Sean A. Irvine
 */
public class A083154 extends A083153 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

