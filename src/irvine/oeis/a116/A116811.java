package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116811.
 * @author Sean A. Irvine
 */
public class A116811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116811() {
    super(new long[] {-1, -16, -10, -17, -25, -25, 7, 14, 5, 2, 1, 2}, new long[] {1, 2, 6, 21, 70, 204, 560, 1617, 4796, 14249, 41939, 122658});
  }
}
