package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005165 Alternating factorials: n! - (n-1)! + (n-2)! - ... 1!.
 * @author Sean A. Irvine
 */
public class A005165 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = mF.subtract(mA);
    return mA;
  }
}
