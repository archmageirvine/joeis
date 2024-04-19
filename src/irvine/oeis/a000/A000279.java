package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000279 Card matching: coefficients B[n,1] of t in the reduced hit polynomial A[n,n,n](t).
 * @author Sean A. Irvine
 */
public class A000279 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      s = s.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).square()
                .divide(Functions.FACTORIAL.z(mN - k - 1))
                .divide(Functions.FACTORIAL.z(mN - k))
                .multiply(Functions.FACTORIAL.z(mN - 1))
                .divide(Functions.FACTORIAL.z(k + 1))
                .divide(Functions.FACTORIAL.z(mN - 1 - k)));
    }
    return s.multiply(3L * mN);
  }
}
