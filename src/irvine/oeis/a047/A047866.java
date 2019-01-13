package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047866.
 * @author Sean A. Irvine
 */
public class A047866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047866() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 1, 3, 8, 15, 27, 42, 63, 90, 124, 165});
  }
}
