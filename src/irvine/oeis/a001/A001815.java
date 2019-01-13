package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001815.
 * @author Sean A. Irvine
 */
public class A001815 implements Sequence {

  private long mN = -1;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    if (mN > 2) {
      mA = mA.multiply(2 * mN).divide(mN - 2);
    }
    return mA;
  }
}
