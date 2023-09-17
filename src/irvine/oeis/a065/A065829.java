package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065829 String formed from first n binary digits found in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065829 extends A065828 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(super.next());
    return mA;
  }
}

