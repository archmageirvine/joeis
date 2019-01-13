package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000254.
 * @author Sean A. Irvine
 */
public class A000254 implements Sequence {

  protected long mN = -1;
  private Z mA = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN - 1);
    mA = mA.multiply(mN).add(mF);
    return mA;
  }

}

