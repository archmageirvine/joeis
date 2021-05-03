package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046885 Row sums of triangle A046658.
 * @author Sean A. Irvine
 */
public class A046885 extends A046714 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(5);
    return mA.subtract(super.next());
  }
}
