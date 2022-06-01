package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030279 COMPOSE squares with squares.
 * @author Sean A. Irvine
 */
public class A030279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030279() {
    super(new long[] {1, -6, 24, -59, 108, -132, 115, -54, 12}, new long[] {1, 8, 50, 276, 1397, 6672, 30565, 135668, 587426});
  }
}
