package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050165 Triangle read by rows: T(n,k) = M(2n+1,k,-1), 0 &lt;= k &lt;= n, n &gt;= 0, array M as in A050144.
 * @author Sean A. Irvine
 */
public class A050165 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = mN;
    }
    final long t = 2 * mN - 1;
    return Binomial.binomial(t, mN - mM).subtract(Binomial.binomial(t, mN - mM - 2));
  }
}
