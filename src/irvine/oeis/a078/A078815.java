package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078815 extends A078215 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
