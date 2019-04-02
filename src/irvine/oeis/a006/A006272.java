package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006272 Denominators of a continued fraction for 1 + sqrt(2).
 * @author Sean A. Irvine
 */
public class A006272 extends A006266 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}
