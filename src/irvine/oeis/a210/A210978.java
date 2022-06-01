package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210978 A186029 and positive terms of A001106 interleaved.
 * @author Sean A. Irvine
 */
public class A210978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210978() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 5, 9, 17});
  }
}
