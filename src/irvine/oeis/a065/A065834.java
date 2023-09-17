package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065834 String formed from first n ternary digits found in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065834 extends A065833 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(super.next());
    return mA;
  }
}

