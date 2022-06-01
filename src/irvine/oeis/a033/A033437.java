package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033437 Number of edges in 5-partite Tur\u00e1n graph of order n.
 * @author Sean A. Irvine
 */
public class A033437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033437() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 14});
  }
}
