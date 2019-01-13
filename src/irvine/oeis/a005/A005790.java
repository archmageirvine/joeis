package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005790.
 * @author Sean A. Irvine
 */
public class A005790 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(4 * mN - 3).multiply(4 * mN - 1).multiply(2 * mN - 1).multiply(8).divide(mN + 1).divide(mN + 2).divide(mN + 3);
    }
    return mA;
  }
}
