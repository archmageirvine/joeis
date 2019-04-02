package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033444 Number of edges in 12-partite Tur&#225;n graph of order n.
 * @author Sean A. Irvine
 */
public class A033444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033444() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 77});
  }
}
