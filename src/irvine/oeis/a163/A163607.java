package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163607 a(n) = ((5 + 2*sqrt(2))*(1 + sqrt(2))^n + (5 - 2*sqrt(2))*(1 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163607() {
    super(new long[] {1, 2}, new long[] {5, 9});
  }
}
