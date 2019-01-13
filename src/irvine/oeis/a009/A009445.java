package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009445.
 * @author Sean A. Irvine
 */
public class A009445 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return mF;
  }
}
