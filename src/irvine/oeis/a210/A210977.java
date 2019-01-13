package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210977.
 * @author Sean A. Irvine
 */
public class A210977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210977() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 7, 11});
  }
}
