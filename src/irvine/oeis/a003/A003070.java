package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003070 a(n) = ceiling(log_2 n!).
 * @author Sean A. Irvine
 */
public class A003070 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(mF.bitLength() - (mN <= 2 ? 1 : 0));
  }
}
