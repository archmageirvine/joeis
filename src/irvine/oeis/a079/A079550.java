package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079550 Array T(m,n) = phi(m^2)*phi(n^2) - phi(m*n)^2 (m,n &gt;= 1), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A079550 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.PHI.z((mM + 1) * (mM + 1)).multiply(Functions.PHI.z((mN - mM) * (mN - mM))).subtract(Functions.PHI.z((mM + 1) * (mM - mN)).square());
  }
}
