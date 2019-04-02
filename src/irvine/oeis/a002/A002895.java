package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002895 Domb numbers: number of 2n-step polygons on diamond lattice.
 * @author Sean A. Irvine
 */
public class A002895 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z n2 = Z.valueOf(mN).square();
      final Z t = mB.multiply2().multiply(2 * mN - 1).multiply(n2.multiply(5).subtract(5 * mN - 2))
        .subtract(mA.shiftLeft(6).multiply(Z.valueOf(mN - 1).pow(3)))
        .divide(n2.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
