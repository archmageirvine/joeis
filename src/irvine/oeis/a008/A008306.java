package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A008306 Triangle T(n,k) read by rows: associated Stirling numbers of first kind (n &gt;= 2, 1 &lt;= k &lt;= floor(n/2)).
 * @author Sean A. Irvine
 */
public class A008306 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 1;
    }
    return Functions.ASSOCIATED_STIRLING1.z(mN, mM);
  }
}


