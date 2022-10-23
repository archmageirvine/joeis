package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001317 Sierpi\u0144ski's triangle (Pascal's triangle mod 2) converted to decimal.
 * @author Sean A. Irvine
 */
public class A001317 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.xor(mA.multiply2());
    }
    return mA;
  }
}
