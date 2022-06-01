package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226701 Positive solutions x/(3*13) of the Pell equation x^2 - 61*y^2 = -4.
 * @author Sean A. Irvine
 */
public class A226701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226701() {
    super(new long[] {-1, 1523}, new long[] {1, 1524});
  }
}
