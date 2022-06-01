package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134507 Number of rectangles in a pyramid built with squares. The squares counted in A092498 are excluded.
 * @author Sean A. Irvine
 */
public class A134507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134507() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 4, 19, 57, 134, 269, 486});
  }
}
