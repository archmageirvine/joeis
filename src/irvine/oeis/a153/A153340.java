package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153340 Number of zig-zag paths from top to bottom of a rectangle of width 8 with n rows.
 * @author Sean A. Irvine
 */
public class A153340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153340() {
    super(new long[] {-1, -2, 3, 1}, new long[] {8, 14, 26, 48});
  }
}
