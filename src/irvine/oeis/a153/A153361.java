package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153361 Number of zig-zag paths from top to bottom of a rectangle of width 12 with n rows.
 * @author Sean A. Irvine
 */
public class A153361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153361() {
    super(new long[] {1, 3, -6, -4, 5, 1}, new long[] {12, 22, 42, 80, 154, 296});
  }
}
