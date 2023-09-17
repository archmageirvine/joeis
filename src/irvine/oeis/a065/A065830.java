package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065830 A065829 converted to base 10.
 * @author Sean A. Irvine
 */
public class A065830 extends A065828 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply2().add(super.next());
    return mA;
  }
}

