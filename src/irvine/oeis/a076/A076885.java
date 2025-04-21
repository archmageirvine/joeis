package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076885 extends Sequence0 {

  private static final CR Z = CR.FIVE.subtract(CR.FIVE.sqrt()).divide(10);
  private CR mA = CR.ONE;
  private CR mB = CR.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final CR t = mA.add(mB).subtract(Z.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB.floor();
  }
}
