package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a003.A003098;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A068643 extends A003098 {

  private Z mLim = Z.ONE;
  {
    super.next(); // skip 0
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    Z t = Z.ZERO;
    while (mA.compareTo(mLim) < 0) {
      t = mA;
      mA = super.next();
    }
    return t;
  }
}
