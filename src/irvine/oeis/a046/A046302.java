package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046302 Product of 4 successive primes.
 * @author Sean A. Irvine
 */
public class A046302 extends A000040 {

  private Z mA = null;
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    mA = mB;
    mB = mC;
    mC = mD;
    mD = super.next();
    return mA.multiply(mB).multiply(mC).multiply(mD);
  }
}
