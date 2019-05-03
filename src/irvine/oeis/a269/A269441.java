package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269441 Alternating sum of <code>10-gonal</code> (or decagonal) pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A269441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269441() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 10, -28, 62});
  }
}
