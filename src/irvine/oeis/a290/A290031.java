package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290031 Number of 6-cycles in the n-hypercube graph.
 * @author Sean A. Irvine
 */
public class A290031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290031() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 0, 0, 16});
  }
}
