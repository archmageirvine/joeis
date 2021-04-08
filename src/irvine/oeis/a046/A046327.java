package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046327 Numbers that are the product of 9 successive primes.
 * @author Sean A. Irvine
 */
public class A046327 extends A000040 {

  private Z mA = null;
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();
  private Z mE = super.next();
  private Z mF = super.next();
  private Z mG = super.next();
  private Z mH = super.next();
  private Z mI = super.next();

  @Override
  public Z next() {
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = mF;
    mF = mG;
    mG = mH;
    mH = mI;
    mI = super.next();
    return mA.multiply(mB).multiply(mC).multiply(mD).multiply(mE).multiply(mF).multiply(mG).multiply(mH).multiply(mI);
  }
}
