package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A085868 Largest n-digit 7-smooth number. Or largest n-digit number with prime divisors &lt; 10.
 * @author Sean A. Irvine
 */
public class A085868 extends A002473 {

  private Z mB = super.next();
  private Z mA = super.next();
  private Z mLim = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (true) {
      if (mA.compareTo(mLim) >= 0) {
        return mB;
      }
      mB = mA;
      mA = super.next();
    }
  }
}
