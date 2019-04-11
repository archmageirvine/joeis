package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122372 Dimension of 8-variable non-commutative harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 8 variables which are killed by all symmetric differential operators (where for a monomial w, d_{xi} ( xi w <code>) =</code> w and d_{xi} <code>( xj</code> w <code>) = 0</code> for i/=j).
 * @author Sean A. Irvine
 */
public class A122372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122372() {
    super(new long[] {2119, -8249, 10190, -5925, 1845, -316, 28}, new long[] {1, 7, 55, 438, 3498, 27962, 223604});
  }
}
