package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001810.
 * @author Sean A. Irvine
 */
public class A001810 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    if (mN > 3) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 3);
    }
    return mA;
  }
}
