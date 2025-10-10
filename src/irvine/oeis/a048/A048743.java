package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048743 Triangle read by rows: T(n,k) = k!*binomial(n-1,k-1)*Stirling2(n,k), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A048743 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mM).multiply(Binomial.binomial(mN - 1, mM - 1)).multiply(Functions.STIRLING2.z(mN, mM));
  }
}
