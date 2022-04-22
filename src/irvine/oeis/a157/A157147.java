package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157147 Triangle T(n, k, m) = (m*(n-k) + 1)*T(n-1, k-1, m) + (m*k + 1)*T(n-1, k, m) + m*k*(n-k)*T(n-2, k-1, m) with T(n, 0, m) = T(n, n, m) = 1 and m = 1, read by rows.
 * @author Georg Fischer
 */
public class A157147 extends Triangle {

  private final int mAdd;
  private final long mM;

  /** Construct the sequence. */
  public A157147() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param add additive parameter
   * @param m multiplicative parameter
   */
  public A157147(final int add, final int m) {
    mAdd = add;
    hasRAM(false);
    mM = m;
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(mM * (n - k) + 1).add(get(n - 1, k).multiply(mM * k + 1))
      .add(Z.valueOf(mAdd * mM * k).multiply(n - k).multiply(get(n - 2, k - 1)));
  }
}
