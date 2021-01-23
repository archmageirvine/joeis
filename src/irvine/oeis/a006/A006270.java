package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006270 Denominators of a continued fraction for (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A006270 extends A006267 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t);
  }
}
