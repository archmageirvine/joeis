package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a014.A014068;

/**
 * A022915 Multinomial coefficients (0, 1, ..., n)! = C(n+1,2)!/(0!*1!*2!*...*n!).
 * @author Sean A. Irvine
 */
public class A022915 extends A014068 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(super.next());
    return mA;
  }
}
