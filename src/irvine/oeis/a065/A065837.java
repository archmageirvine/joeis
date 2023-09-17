package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065837 String formed from first n quaternary digits found in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065837 extends A065836 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(super.next());
    return mA;
  }
}

