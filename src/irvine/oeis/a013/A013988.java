package irvine.oeis.a013;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a049.A049224;
import irvine.oeis.triangle.DirectArray;

/**
 * A013988 Triangle read by rows, the inverse Bell transform of n!*binomial(5,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A013988 extends A049224 implements DirectArray {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM))).divide(Z.SIX.pow(mN - mM));
  }

  @Override
  public Z a(final long n, final long k) {
    return get(n, k).multiply(Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k))).divide(Z.SIX.pow(n - k));
  }

}
