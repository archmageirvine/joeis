package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122368 Dimension of 4-variable non-commutative harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 4 variables which are killed by all symmetric differential operators (where for a monomial w, d_{xi} ( xi w ) = w and d_{xi} ( xj w ) = 0 for i/=j).
 * @author Sean A. Irvine
 */
public class A122368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122368() {
    super(1, new long[] {3, -9, 6}, new long[] {1, 3, 11});
  }
}
