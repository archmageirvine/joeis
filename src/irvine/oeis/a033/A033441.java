package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033441 Number of edges in 9-partite Tur\u00e1n graph of order n.
 * @author Sean A. Irvine
 */
public class A033441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033441() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 21, 28, 36, 44});
  }
}
