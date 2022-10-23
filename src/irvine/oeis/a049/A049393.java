package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049393 Expansion of (1-25*x)^(1/5).
 * @author Sean A. Irvine
 */
public class A049393 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(5 * mN - 6).multiply(5).divide(mN);
    }
    return mA;
  }
}
