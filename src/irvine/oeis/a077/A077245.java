package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077245 Bisection (even part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077245() {
    super(new long[] {-1, 8}, new long[] {1, 10});
  }
}
