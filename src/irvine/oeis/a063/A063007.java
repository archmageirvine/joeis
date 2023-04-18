package irvine.oeis.a063;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063007 T(n,k) = binomial(n,k)*binomial(n+k,k), 0 &lt;= k &lt;= n, triangle read by rows.
 * @author Sean A. Irvine
 */
public class A063007 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(Binomial.binomial(mN + mM, mM));
  }
}
