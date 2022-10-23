package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055634 2-adic factorial function.
 * @author Sean A. Irvine
 */
public class A055634 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = (mN & 1) == 0 ? mA.negate() : mA.multiply(-mN);
    }
    return mA;
  }
}

