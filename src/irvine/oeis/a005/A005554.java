package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005554 Sums of successive Motzkin numbers.
 * @author Sean A. Irvine
 */
public class A005554 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN > 2) {
      final Z t = mB.multiply(2 * mN).add(mA.multiply(3 * mN - 9)).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
