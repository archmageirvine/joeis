package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003947 Expansion of (1+x)/(1-4*x).
 * @author Sean A. Irvine
 */
public class A003947 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.FIVE;
    } else {
      mA = mA.shiftLeft(2);
    }
    return mA;
  }
}
