package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002474.
 * @author Sean A. Irvine
 */
public class A002474 implements Sequence {

  private int mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(mN).multiply(mN + 1).shiftLeft(2);
    }
    return mF;
  }
}
