package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210977 <code>A005475</code> and positive terms of <code>A000566</code> interleaved.
 * @author Sean A. Irvine
 */
public class A210977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210977() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 7, 11});
  }
}
