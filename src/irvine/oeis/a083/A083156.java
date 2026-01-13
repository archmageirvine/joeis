package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083156 a(n) = A083155(n+1)/A083155(n).
 * @author Sean A. Irvine
 */
public class A083156 extends A083155 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

