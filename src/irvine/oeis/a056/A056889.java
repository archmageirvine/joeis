package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056889 Numerators of continued fraction for left factorial.
 * @author Sean A. Irvine
 */
public class A056889 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z t = (mN & 1) == 0 ? mB.multiply(mN / 2).add(mA) : mA.subtract(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
