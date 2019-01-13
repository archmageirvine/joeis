package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137694.
 * @author Sean A. Irvine
 */
public class A137694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137694() {
    super(new long[] {1, -1155, 1155}, new long[] {5, 5577, 6435661});
  }
}
