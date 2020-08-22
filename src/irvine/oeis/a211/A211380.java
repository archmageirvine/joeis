package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211380 Number of pairs of intersecting diagonals in the interior and exterior of a regular n-gon.
 * @author Sean A. Irvine
 */
public class A211380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211380() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 5, 15, 42, 94, 189});
  }
}
