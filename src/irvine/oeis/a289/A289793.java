package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289793 Number of 5-cycles in the n-tetrahedral graph.
 * @author Sean A. Irvine
 */
public class A289793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289793() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 0, 312, 3024, 14868, 51744});
  }
}
