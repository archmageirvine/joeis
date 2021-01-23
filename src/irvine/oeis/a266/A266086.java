package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266086 Alternating sum of 9-gonal (or nonagonal) numbers.
 * @author Sean A. Irvine
 */
public class A266086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266086() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, -1, 8, -16});
  }
}
