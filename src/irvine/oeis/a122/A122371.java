package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122371 Dimension of <code>7-variable non-commutative</code> harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 7 variables which are killed by all symmetric differential operators (where for a monomial w, <code>d_{xi} (</code> xi w <code>) =</code> w and <code>d_{xi} (</code> xj w <code>) = 0</code> for <code>i/=j)</code>.
 * @author Sean A. Irvine
 */
public class A122371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122371() {
    super(new long[] {-309, 1157, -1314, 669, -170, 21}, new long[] {1, 6, 41, 285, 1989, 13901});
  }
}
