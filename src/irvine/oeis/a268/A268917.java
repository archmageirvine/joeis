package irvine.oeis.a268;

import irvine.math.q.Q;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A268917 Numerators of the rational number triangle R(n, k) = -k*(n-k)*(n - 2*k)/(6*n), n &gt;= 1, k = 1, ..., n. This is a regularized Sum_{j &gt;= 0} (k + n*j)^(-s) for s = -2 defined by analytic continuation of a generalized Hurwitz zeta function.
 * This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = -2 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A268917 extends RationalTriangle {

  /** Construct the sequence. */
  public A268917() {
    super(1);
    hasRAM(true);
  }

  @Override
  public Q compute(int m, int a) {
    ++m;
    ++a;
    return new Q(-a * (m - a) * (m - 2L * a), 6L * m);
  }
}
