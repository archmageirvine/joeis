package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157207 Triangle T(n, k, m) = (m*(n-k) + 1)*T(n-1, k-1, m) + (m*k + 1)*T(n-1, k, m) + m*f(n,k)*T(n-2, k-1, m)
 * with T(n, 0, m) = T(n, n, m) = 1, f(n, k) = k if k &lt;= floor(n/2) otherwise n-k, and m = 1, read by rows.
 * @author Georg Fischer
 */
public class A157207 extends Triangle {

  private int mN;
  private int mAdd;
  private int mM;

  /** Construct the sequence. */
  public A157207() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param add additive parameter
   * @param m multiplicative parameter
   */
  public A157207(final int add, final int m) {
    mN = -1;
    mAdd = add;
    hasRAM(false);
    mM = m;
  }

  @Override
  public Z compute(final int n, final int k) {
    final Z f = k <= n / 2 ? Z.valueOf(k) : Z.valueOf(n - k);
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(mM * (n - k) + 1).add(get(n - 1, k).multiply(mM * k + 1))
      .add(f.multiply(mAdd * mM).multiply(get(n - 2, k - 1)));
  }
}
