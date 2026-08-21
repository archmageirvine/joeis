package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086323 Number of n X n circulant invertible (0,1) matrices over the reals.
 * @author Sean A. Irvine
 */
public class A086323 extends A086328 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return mA.subtract(super.next());
  }
}
