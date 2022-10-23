package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003692 Number of trees on n labeled vertices with degree at most 3.
 * @author Sean A. Irvine
 */
public class A003692 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mB.multiply(mN + 1).multiply(2 * mN + 1)
        .add(mA.multiply(mN).multiply(mN + 1).multiply(mN - 2))
        .divide(mN + 3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
