package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026181 a(n) = (1/2)*(s(n) - s(n-1)), where s = A026180.
 * @author Sean A. Irvine
 */
public class A026181 extends A026180 {

  {
    super.next();
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).divide2();
  }
}
