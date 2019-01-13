package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002011.
 * @author Sean A. Irvine
 */
public class A002011 implements Sequence {

  private long mN = -1;
  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN + 1).multiply2().divide(mN);
    }
    return mA;
  }
}
