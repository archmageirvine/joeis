package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137798 Partial sums of <code>A137797</code>.
 * @author Sean A. Irvine
 */
public class A137798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137798() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 0}, new long[] {0, 0, 4, 8, 16, 14, 16});
  }
}
