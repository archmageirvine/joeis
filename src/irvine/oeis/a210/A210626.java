package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210626 Values of the prime-generating polynomial <code>4*n^2 - 284*n + 3449</code>.
 * @author Sean A. Irvine
 */
public class A210626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210626() {
    super(new long[] {1, -3, 3}, new long[] {3449, 3169, 2897});
  }
}
