package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290029 Number of 6-cycles in the n-halved cube graph.
 * @author Sean A. Irvine
 */
public class A290029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290029() {
    super(new long[] {128, -448, 672, -560, 280, -84, 14}, new long[] {0, 0, 0, 640, 34720, 533760, 4735360});
  }
}
