package irvine.oeis.a268;

import irvine.math.q.Q;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A268915 Numerators of the rational number triangle R(m, a) = - (m^2 - 6*m*a + 6*a^2)/(12*m), m &gt;= 1, a = 1, ..., m.  This is a regularized Sum_{j &gt;= 0} (a + m*j) defined by analytic continuation of a generalized Hurwitz Zeta function.
 * This is a regularized Sum_{j &gt;= 0} (a + m*j) defined by analytic continuation of a generalized Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A268915 extends RationalTriangle {

  /** Construct the sequence. */
  public A268915() {
    super(1);
    hasRAM(true);
  }

  @Override
  public Q compute(int m, int a) {
    ++m;
    ++a;
    return new Q(-(m * m - 6 * m * a + 6 * a * a), 12 * m);
  }
}
