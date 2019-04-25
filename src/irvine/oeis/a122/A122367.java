package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122367 Dimension of 3-variable non-commutative harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 3 variables which are killed by all symmetric differential operators (where for a monomial w, d_{xi} <code>( xi</code> w <code>) =</code> w and d_{xi} <code>( xj</code> w <code>) = 0</code> for <code>i != j)</code>.
 * @author Sean A. Irvine
 */
public class A122367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122367() {
    super(new long[] {-1, 3}, new long[] {1, 2});
  }
}
