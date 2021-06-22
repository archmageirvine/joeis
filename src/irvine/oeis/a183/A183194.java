package irvine.oeis.a183;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A183194 Final prime of first member of A019518 that is divisible by 3^n.
 * @author Georg Fischer
 */

public class A183194 extends A000040 {
  
  private Z mBase;
  private Z mPow;
  private Z mPrime;
  private final StringBuilder mA;
  
  /** Construct the sequence */
  public A183194() {
    this(3);
  }
  
  /** 
   * Generic constructor with parameter
   * @param parm base number for power that should divide the Smarandache-Wellin number
   */
  public A183194(final int parm) {
    mBase = Z.valueOf(parm);
    mPow = Z.ONE;
    mA = new StringBuilder();
    mPrime = super.next();
    mA.append(mPrime.toString());
  }
  
  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    Z swn = new Z(mA);
    while (swn.mod(mPow) != Z.ZERO) {
      mPrime = super.next();
      mA.append(mPrime.toString());
      swn = new Z(mA);
    }
    return mPrime;
  }
}
