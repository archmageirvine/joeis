package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051544 Quotients of consecutive values of lcm {1, 4, 7, 10, 13 ...,(3n+1)} (A016777).
 * @author Sean A. Irvine
 */
public class A051544 extends A051536 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
