package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;

/**
 * A005161 Number of alternating sign 2n+1 X 2n+1 matrices symmetric with respect to both horizontal and vertical axes (VHSASM's).
 * @author Sean A. Irvine
 */
public class A005161 extends Sequence0 implements Conjectural {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      final long n = mN / 4;
      if ((mN & 3) == 1) {
        mA = mA.multiply(3 * n - 1).multiply(Binomial.binomial(6 * n - 3, 2 * n - 1)).divide(4 * n - 1).divide(Binomial.binomial(4 * n - 2, 2 * n - 1));
      } else {
        mA = mA.multiply(3 * n + 1).multiply(Binomial.binomial(6 * n, 2 * n)).divide(4 * n + 1).divide(Binomial.binomial(4 * n, 2 * n));
      }
    }
    return mA;
  }
}
