package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002775.
 * @author Sean A. Irvine
 */
public class A002775 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN * mN);
  }
}
