package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014533 Form array in which n-th row is obtained by expanding (1 + x + x^2)^n and taking the 4th column from the center.
 * @author Sean A. Irvine
 */
public class A014533 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN > 2) {
      final Z t = mB.multiply(mN + 3).multiply(2 * mN + 5)
        .add(mA.multiply(mN + 3).multiply(mN + 2).multiply(3))
        .divide(mN - 1).divide(mN + 7);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
