package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008276 Triangle of Stirling numbers of first kind, s(n, <code>n-k+1), n &gt;= 1, 1 &lt;= k &lt;= n.</code> Also triangle T(n,k) giving coefficients in expansion of n!*binomial(x,n)/x in powers of x.
 * @author Sean A. Irvine
 */
public class A008276 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Stirling.firstKind(mN, mM);
  }
}

