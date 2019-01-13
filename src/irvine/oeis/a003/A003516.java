package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003516.
 * @author Sean A. Irvine
 */
public class A003516 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 1;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(2 * mN + 1).multiply(2 * mN).divide(mN + 3).divide(mN - 2);
    }
    return mA;
  }
}
