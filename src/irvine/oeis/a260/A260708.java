package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260708.
 * @author Sean A. Irvine
 */
public class A260708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260708() {
    super(new long[] {1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {0, 1, 3, 6, 10, 16, 21, 29, 36});
  }
}
