package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278036 Number of ways to construct a triangle with longest side n using unit-length straws of two colors for the sides.
 * @author Sean A. Irvine
 */
public class A278036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278036() {
    super(new long[] {2048, -2304, 640, 144, -104, 18}, new long[] {4, 40, 416, 3808, 33472, 282752});
  }
}
