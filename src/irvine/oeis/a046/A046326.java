package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046326 Product of 8 successive primes.
 * @author Sean A. Irvine
 */
public class A046326 extends A000040 {

  private Z mA = null;
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();
  private Z mE = super.next();
  private Z mF = super.next();
  private Z mG = super.next();
  private Z mH = super.next();

  @Override
  public Z next() {
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = mF;
    mF = mG;
    mG = mH;
    mH = super.next();
    return mA.multiply(mB).multiply(mC).multiply(mD).multiply(mE).multiply(mF).multiply(mG).multiply(mH);
  }
}
