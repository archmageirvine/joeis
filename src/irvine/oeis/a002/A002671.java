package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002671.
 * @author Sean A. Irvine
 */
public class A002671 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(2 * mN + 1).shiftLeft(3);
    }
    return mA;
  }
}
