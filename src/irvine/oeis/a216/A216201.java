package irvine.oeis.a216;
// manually 2021-10-16

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A216201 Square array T, read by antidiagonals : T(n,k) = 0 if n-k&gt;=3 or if k-n&gt;=4, T(2, 0) = T(1, 0) = T(0, 0) = T(0, 1) = T(0, 2) = T(0, 3) = 1, T(n,k) = T(n-1,k) + T(n,k-1). 
 * @author Georg Fischer
 */
public class A216201 extends Triangle {

  protected long mRangeN; // 
  protected long mRangeK; // set T(0,k) = 1 for k = 0..mRangeN
  // T(n,k) = 0 if n-k&gt;=3 or if k-n&gt;=4

  /** Construct the sequence. */
  public A216201() {
    this(2, 3);
  }

  /**
   * Generic constructor with parameters.
   * Set <code>T(n,k) = 0</code> if <code>n - k &gt;= mRangeN + 1 </code> or if <code>k - n &gt;= mRangeK + 1</code>-
   * @param rangeN set <code>T(n, 0) = 1</code> for <code>n = mRangeN..0</code>
   * @param rangeK set <code>T(0,k) = 1</code> for <code>k = 0..mRangek</code>
   */
  public A216201(final long rangeK, final long rangeN) {
    mRangeN = rangeN;
    mRangeK = rangeK;
  }

  @Override
  protected Z compute(final int n, final int k) {
    Z result = Z.ZERO;
    if (k == 0) {
      result = n <= mRangeN ? Z.ONE : Z.ZERO;
    } else if (k == n) {
      result = k <= mRangeK ? Z.ONE : Z.ZERO;
  /*
    } else if (n - k >= mRangeN + 1 || k - n >= mRangeK + 1) {
      // Z.ZERO already set
  */
    } else if (get(n - 2, k - 1).equals(Z.ZERO)) {
      // Z.ZERO already set
    } else {
      result = get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
    }
    return result;
  }
}
