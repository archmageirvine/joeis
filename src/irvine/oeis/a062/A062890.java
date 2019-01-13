package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062890.
 * @author Sean A. Irvine
 */
public class A062890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062890() {
    super(new long[] {-1, 1, 1, -1, 1, -1, 0, 0, -1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 2, 3, 4, 5, 7, 8});
  }
}
