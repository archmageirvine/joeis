package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157272 Triangle T(n, k, m) = (m*(n-k) + 1)*T(n-1, k-1, m) + (m*k + 1)*T(n-1, k, m) + m*f(n,k)*T(n-2, k-1, m) with T(n, 0, m) = T(n, n, m) = 1, f(n, k) = 2*k+1 if k &lt;= floor(n/2) otherwise 2*(n-k)+1, and m = 1, read by rows.
 * with T(n, 0, m) = T(n, n, m) = 1, f(n, k) = 2*k+1 if k &lt;= floor(n/2) otherwise 2*(n-k)+1, and m = 1, read by rows.
 * @author Georg Fischer
 */
public class A157272 extends Triangle {

  private int mN;
  private int mAdd;
  private int mM;

  /** Construct the sequence. */
  public A157272() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param add additive parameter
   * @param m multiplicative parameter
   */
  public A157272(final int add, final int m) {
    mN = -1;
    mAdd = add;
    mM = m;
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    final Z f = k <= n / 2 ? Z.TWO.multiply(k).add(mAdd) : Z.TWO.multiply(n - k).add(mAdd);
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(mM * (n - k) + 1).add(get(n - 1, k).multiply(mM * k + 1)).add(f.multiply(mM).multiply(get(n - 2, k - 1)));
  }
}
