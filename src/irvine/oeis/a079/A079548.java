package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079548 Array T(m,n) = n*phi(m) - phi(mn) (m,n &gt;= 1), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A079548 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.PHI.z(mN - mM).multiply(mM + 1).subtract(Functions.PHI.z((mM + 1) * (mM - mN)));
  }
}
