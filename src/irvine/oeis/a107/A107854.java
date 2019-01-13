package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107854.
 * @author Sean A. Irvine
 */
public class A107854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107854() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 1, 2, 3, 3, 5});
  }
}
