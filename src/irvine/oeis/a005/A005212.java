package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005212.
 * @author Sean A. Irvine
 */
public class A005212 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.ZERO;
    }
    if (mN > 2) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return mF;
  }
}
