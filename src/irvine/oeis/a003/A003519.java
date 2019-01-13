package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003519.
 * @author Sean A. Irvine
 */
public class A003519 implements Sequence {

  private Z mA = Z.ONE;
  protected long mN = 3;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(2 * mN + 1).multiply(2 * mN).divide(mN + 6).divide(mN - 4);
    }
    return mA;
  }
}
