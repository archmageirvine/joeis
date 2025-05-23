package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077478 Rectangular array R read by antidiagonals: R(i,j) is the number of integers k that divide both i and j (i &gt;= 1, j &gt;= 1).
 * @author Sean A. Irvine
 */
public class A077478 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.SIGMA0.z(Functions.GCD.l(mN - mM + 1, mM));
  }
}
