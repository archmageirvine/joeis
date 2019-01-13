package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014481.
 * @author Sean A. Irvine
 */
public class A014481 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(2L * mN + 1).shiftLeft(mN);
  }
}
