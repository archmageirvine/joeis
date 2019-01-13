package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241592.
 * @author Sean A. Irvine
 */
public class A241592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241592() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 1, 1, 2, 3, 2, 5, 6});
  }
}
