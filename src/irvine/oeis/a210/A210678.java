package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210678.
 * @author Sean A. Irvine
 */
public class A210678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210678() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 6, 12});
  }
}
