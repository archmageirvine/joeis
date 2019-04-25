package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122368 Dimension of 4-variable non-commutative harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 4 variables which are killed by all symmetric differential operators (where for a monomial w, d_{xi} <code>( xi</code> w <code>) =</code> w and d_{xi} <code>( xj</code> w <code>) = 0</code> for <code>i/=j)</code>.
 * @author Sean A. Irvine
 */
public class A122368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122368() {
    super(new long[] {3, -9, 6}, new long[] {1, 3, 11});
  }
}
