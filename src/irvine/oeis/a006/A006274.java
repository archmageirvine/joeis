package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006274 Denominators of a continued fraction for (3+sqrt(13))/2.
 * @author Sean A. Irvine
 */
public class A006274 extends A006268 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}
