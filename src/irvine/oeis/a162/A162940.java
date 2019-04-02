package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162940 Binomial[n + 1, 2]*6^2 .
 * @author Sean A. Irvine
 */
public class A162940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162940() {
    super(new long[] {1, -3, 3}, new long[] {0, 36, 108});
  }
}
