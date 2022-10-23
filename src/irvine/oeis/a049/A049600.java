package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049600 Array T read by diagonals; T(i,j) is the number of paths from (0,0) to (i,j) consisting of nonvertical segments (x(k),y(k))-to-(x(k+1),y(k+1)) such that 0 = x(1) &lt; x(2) &lt; ... &lt; x(n-1) &lt; x(n)=i, 0 = y(1) &lt;= y(2) &lt;= ... &lt;= y(n-1) &lt;= y(n)=j, for i &gt;= 0, j &gt;= 0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A049600 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    Z sum = Z.ZERO;
    for (long j = 0; j < n; ++j) {
      sum = sum.add(Binomial.binomial(k + j, j).multiply(Binomial.binomial(n - 1, j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
