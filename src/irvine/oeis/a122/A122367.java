package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122367 Dimension of <code>3-variable non-commutative</code> harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 3 variables which are killed by all symmetric differential operators (where for a monomial w, <code>d_{xi} (</code> xi w <code>) =</code> w and <code>d_{xi} (</code> xj w <code>) = 0</code> for i <code>!= j)</code>.
 * @author Sean A. Irvine
 */
public class A122367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122367() {
    super(new long[] {-1, 3}, new long[] {1, 2});
  }
}
