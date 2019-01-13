package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200048.
 * @author Sean A. Irvine
 */
public class A200048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200048() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {4, 59, 220, 581, 1162, 2105, 3370});
  }
}
