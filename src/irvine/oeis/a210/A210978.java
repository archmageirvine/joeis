package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210978 <code>A186029</code> and positive terms of <code>A001106</code> interleaved.
 * @author Sean A. Irvine
 */
public class A210978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210978() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 5, 9, 17});
  }
}
