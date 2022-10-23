package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058878 Triangle T(n,k) is the number of labeled graphs of even degree with n nodes and k edges (n &gt;= 0, 0 &lt;= k &lt;= n(n-1)/2).
 * @author Sean A. Irvine
 */
public class A058878 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      Z s = Z.ZERO;
      for (int j = 0; j <= mM; ++j) {
        final long u = Binomial.binomial(k, 2).add(Binomial.binomial(mN - k, 2)).longValueExact();
        s = s.signedAdd((j & 1) == 0, Binomial.binomial((long) k * (mN - k), j).multiply(Binomial.binomial(u, mM - j)));
      }
      sum = sum.add(s.multiply(Binomial.binomial(mN, k)));
    }
    return sum.shiftRight(mN);
  }
}
