package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046301 Product of 3 successive primes.
 * @author Sean A. Irvine
 */
public class A046301 extends A000040 {

  private Z mA = null;
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    mA = mB;
    mB = mC;
    mC = super.next();
    return mA.multiply(mB).multiply(mC);
  }
}
