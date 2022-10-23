package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036766 Number of ordered rooted trees with n non-root nodes and all outdegrees &lt;= four.
 * @author Sean A. Irvine
 */
public class A036766 extends Sequence0 {

  private long mN = 0;

  protected long r() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 1) / (r() + 1); ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * mN - 2 - k * (r() + 1), mN - 1)));
    }
    return sum.divide(mN);
  }
}
