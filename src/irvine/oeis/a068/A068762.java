package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068723.
 * @author Sean A. Irvine
 */
public class A068762 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 1, Jaguar.factor(mN).sigma());
    return mSum;
  }
}
