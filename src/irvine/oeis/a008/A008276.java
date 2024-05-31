package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008276 Triangle of Stirling numbers of first kind, s(n, n-k+1), n &gt;= 1, 1 &lt;= k &lt;= n. Also triangle T(n,k) giving coefficients in expansion of n!*binomial(x,n)/x in powers of x.
 * @author Sean A. Irvine
 */
public class A008276 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Functions.STIRLING1.z(mN, mM);
  }
}

