package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008542.
 * @author Sean A. Irvine
 */
public class A008542 implements Sequence {

  private long mN = -11;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 6;
    if (mN > 1) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
