package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065838 A065837 converted to base 10.
 * @author Sean A. Irvine
 */
public class A065838 extends A065836 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(4).add(super.next());
    return mA;
  }
}

