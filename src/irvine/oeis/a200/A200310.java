package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200310.
 * @author Sean A. Irvine
 */
public class A200310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200310() {
    super(new long[] {-2, 2, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 3, 5, 8, 12});
  }
}
