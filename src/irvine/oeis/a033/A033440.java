package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033440 Number of edges in 8-partite Tur&#225;n graph of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033440() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 21, 28, 35});
  }
}
