package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008546.
 * @author Sean A. Irvine
 */
public class A008546 implements Sequence {

  private long mN = -6;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 5;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
