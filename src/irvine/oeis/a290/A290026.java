package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290026 Number of 3-cycles in the n-halved cube graph.
 * @author Sean A. Irvine
 */
public class A290026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290026() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 0, 4, 32});
  }
}
