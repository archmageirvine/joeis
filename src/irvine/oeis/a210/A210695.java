package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210695.
 * @author Sean A. Irvine
 */
public class A210695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210695() {
    super(new long[] {1, -7, 7}, new long[] {0, 1, 12});
  }
}
