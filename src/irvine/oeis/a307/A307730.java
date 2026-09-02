package irvine.oeis.a307;

import irvine.math.z.Z;

/**
 * A307720
 * @author Sean A. Irvine
 */
public class A307730 extends A307720 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply(t);
  }
}
