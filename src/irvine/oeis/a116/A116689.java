package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116689 Partial sums of dodecahedral numbers (A006566).
 * @author Sean A. Irvine
 */
public class A116689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116689() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 21, 105, 325});
  }
}
