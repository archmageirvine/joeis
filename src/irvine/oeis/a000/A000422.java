package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000422.
 * @author Sean A. Irvine
 */
public class A000422 implements Sequence {

  private long mN = 0;
  private long mMult = 10;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= mMult) {
      mMult *= 10;
    }
    mA = mB.multiply(mN).add(mA);
    mB = mB.multiply(mMult);
    return mA;
  }
}

