package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060408 Triangle T(n,k) in which n-th row gives numbers of super edge-magic labelings of (n,k)-graphs, for n &gt;= 2, and 1 &lt;= k &lt;= 2n-3.
 * @author Sean A. Irvine
 */
public class A060408 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  private Z t(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 3; i <= 2 * n - k; ++i) {
      Z prod = Z.ONE;
      for (int j = i; j < i + k; ++j) {
        if (j <= n + 1) {
          prod = prod.multiply((j - 1) / 2);
        } else {
          prod = prod.multiply((2L * n - j + 1) / 2);
        }
      }
      sum = sum.add(prod);
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN - 3) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
