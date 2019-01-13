package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010845.
 * @author Sean A. Irvine
 */
public class A010845 implements Sequence {

  private int mN = -3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 3;
    if (mN > 0) {
      mA = mA.multiply(mN).add(1);
    }
    return mA;
  }
}
