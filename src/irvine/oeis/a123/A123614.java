package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123614 Column 4 of triangle A123610.
 * @author Sean A. Irvine
 */
public class A123614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123614() {
    super(new long[] {-1, 4, -4, -4, 12, -12, 4, 12, -22, 12, 4, -12, 12, -4, -4, 4}, new long[] {1, 5, 39, 175, 618, 1764, 4420, 9900, 20439, 39325, 71603, 124215, 207076, 333200, 520272, 790704});
  }
}
