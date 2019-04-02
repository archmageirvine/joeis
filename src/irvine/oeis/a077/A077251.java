package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077251 Bisection (even part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077251() {
    super(new long[] {-1, 10}, new long[] {1, 12});
  }
}
