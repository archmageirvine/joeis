package irvine.oeis.a013;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a049.A049224;

/**
 * A013988 Triangle read by rows, the inverse Bell transform of n!*binomial(5,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A013988 extends A049224 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get((long) mN, (long) mM).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM))).divide(Z.SIX.pow(mN - mM));
  }
}
