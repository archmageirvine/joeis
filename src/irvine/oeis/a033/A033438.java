package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033438 Number of edges in 6-partite Tur\u00e1n graph of order n.
 * @author Sean A. Irvine
 */
public class A033438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033438() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 20});
  }
}
