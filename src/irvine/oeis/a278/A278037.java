package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278037 Number of ways to construct a triangle with longest side n using unit-length straws of three colors for the sides.
 * @author Sean A. Irvine
 */
public class A278037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278037() {
    super(new long[] {177147, -104976, 12393, 2592, -675, 48}, new long[] {10, 300, 9405, 271701, 7586055, 207778365});
  }
}
