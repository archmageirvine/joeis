package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076148 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3).signedAdd((mN & 1) == 1, Z.valueOf(mN + 1));
    }
    return mA;
  }
}
