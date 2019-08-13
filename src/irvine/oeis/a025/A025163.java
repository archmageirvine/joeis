package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025163.
 * @author Sean A. Irvine
 */
public class A025163 implements Sequence {

  private long mN = 0;
  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    } else if (++mN > 1) {
      final Z t = mB.multiply(4 * mN - 2).subtract(mA.multiply(8 * mN)).divide(mN - 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
