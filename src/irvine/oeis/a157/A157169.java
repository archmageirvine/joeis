package irvine.oeis.a157;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157169 Triangle, read by rows, T(n,k,m) = (m*(n-k)+1)*binomial(n-1, k-1) + (m*k+1)* binomial(n-1, k) + m*k*(n-k)*binomial(n-2, k-1), with m=1.
 * @author Georg Fischer
 */
public class A157169 extends Triangle {

  private final int mAdd;
  private final long mM;

  /** Construct the sequence. */
  public A157169() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param add additive parameter
   * @param m multiplicative parameter
   */
  public A157169(final int add, final int m) {
    mAdd = add;
    mM = m;
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : Binomial.binomial(n - 1, k - 1).multiply(mM * (n - k) + 1).add(Binomial.binomial(n - 1, k).multiply(mM * k + 1))
      .add(Binomial.binomial(n - 2, k - 1).multiply(mAdd * mM * k).multiply(n - k));
  }
}
