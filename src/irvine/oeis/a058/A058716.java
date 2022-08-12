package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058716 Triangle T(n,k) giving number of nonisomorphic loopless matroids of rank k on n labeled points (n &gt;= 0, 0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A058716 implements Sequence {

  // I think there is a good chance that the formula used here due to Paul Barry is wrong.

  private int mN = -1;
  private int mM = 0;

  private Z innerSum(final int i, final int k) {
    return Integers.SINGLETON.sum(0, i - k, j -> Binomial.binomial(k, 2L * j).multiply(Binomial.binomial(i - k, 2L * j)));
  }

  protected Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= n; ++i) {
      sum = sum.signedAdd(((i - k) & 1) == 0, Binomial.binomial(n, i).multiply(innerSum(i, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
