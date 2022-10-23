package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005789 3-dimensional Catalan numbers.
 * @author Sean A. Irvine
 */
public class A005789 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3 * mN - 2).multiply(3 * mN - 1).multiply(3).divide(mN + 1).divide(mN + 2);
    }
    return mA;
  }
}
