package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007655 Standard deviation of A007654.
 * @author Sean A. Irvine
 */
public class A007655 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mB.multiply(14).subtract(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
