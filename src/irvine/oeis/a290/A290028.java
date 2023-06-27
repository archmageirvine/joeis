package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290028 Number of 5-cycles in the n-halved cube graph.
 * @author Sean A. Irvine
 */
public class A290028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290028() {
    super(1, new long[] {-64, 192, -240, 160, -60, 12}, new long[] {0, 0, 0, 288, 5664, 50688});
  }
}
