package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028389 The 5x + 1 sequence beginning at 7.
 * @author Sean A. Irvine
 */
public class A028389 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
    } else {
      mA = mA.isEven() ? mA.divide2() : mA.multiply(5).add(1);
    }
    return mA;
  }
}
