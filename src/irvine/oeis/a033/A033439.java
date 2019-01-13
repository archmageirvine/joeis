package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033439.
 * @author Sean A. Irvine
 */
public class A033439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033439() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 21, 27});
  }
}
