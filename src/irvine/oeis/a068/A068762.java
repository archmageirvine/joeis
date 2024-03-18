package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068762 Alternating sum sigma(1)-sigma(2)+sigma(3)-sigma(4)+...+((-1)^(n+1))*sigma(n).
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
