package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008544.
 * @author Sean A. Irvine
 */
public class A008544 implements Sequence {

  private long mN = -4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
