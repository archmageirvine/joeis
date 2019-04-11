package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173707 Partial sums of <code>floor(n^3/3)</code>.
 * @author Sean A. Irvine
 */
public class A173707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173707() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 2, 11, 32, 73, 145});
  }
}
