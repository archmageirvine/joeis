package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006472.
 * @author Sean A. Irvine
 */
public class A006472 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mF).multiply(mN + 1).shiftRight(mN);
  }
}
