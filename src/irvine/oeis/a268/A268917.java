package irvine.oeis.a268;

import irvine.math.q.Q;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A268917 Numerators of the rational number triangle R(m, a) = -a*(m-a)*(m - 2*a)/(6*m), m &gt;= 1, a = 1, ..., m. This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = -2 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = -2 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A268917 extends RationalTriangle {

  /** Construct the sequence. */
  public A268917() {
    hasRAM(true);
  }

  @Override
  public Q compute(int m, int a) {
    ++m;
    ++a;
    return new Q(-a * (m - a) * (m - 2 * a), 6 * m);
  }
}
