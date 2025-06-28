package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078397 a(n) = A078296(n+1)/A078296(n).
 * @author Sean A. Irvine
 */
public class A078397 extends A078296 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

