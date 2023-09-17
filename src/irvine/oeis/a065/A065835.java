package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065835 A065834 converted to base 10.
 * @author Sean A. Irvine
 */
public class A065835 extends A065833 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(3).add(super.next());
    return mA;
  }
}

