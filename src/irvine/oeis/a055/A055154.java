package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055154 Triangle read by rows: T(n,k) = number of k-covers of a labeled n-set, k=1..2^n-1.
 * T(n,k) = Sum_{j=0..n} (-1)^j*C(n, j)*C(2^(n-j)-1, k), k=1..2^n-1.
 * @author Georg Fischer
 */
public class A055154 extends Sequence1 {

  private int mRow;
  private int mCol;
  private int mBehind;

  /** Construct the sequence. */
  public A055154() {
    mRow = 0;
    mCol = 0;
    mBehind = 0;
  }

  /**
   * Compute a triangle element
   * @param n row index
   * @param k column index
   * @return T(n, k)
   */
  protected Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n, j).multiply(Binomial.binomial((1L << (n - j)) - 1, k)).multiply(((j & 1) == 0) ? 1 : -1));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mCol;
    if (mCol >= mBehind) {
      ++mRow;
      mCol = 1;
      mBehind = 1 << mRow;
    }
    return compute(mRow, mCol);
  }
}
