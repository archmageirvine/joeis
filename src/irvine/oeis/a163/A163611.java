package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163611 a(n) = ((5 + 2*sqrt(2))*(5 + sqrt(2))^n + (5 - 2*sqrt(2))*(5 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163611() {
    super(new long[] {-23, 10}, new long[] {5, 29});
  }
}
