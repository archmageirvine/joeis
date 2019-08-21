package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000315;

/**
 * A002860.
 * @author Sean A. Irvine
 */
public class A002860 extends A000315 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      mF = mF.multiply(mN - 1);
    }
    return super.next().multiply(mF.square()).multiply(mN);
  }
}
