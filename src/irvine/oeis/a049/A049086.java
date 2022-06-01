package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049086 Number of tilings of 4 X 3n rectangle by 1 X 3 rectangles. Rotations and reflections are considered distinct tilings.
 * @author Sean A. Irvine
 */
public class A049086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049086() {
    super(new long[] {1, -3, 5}, new long[] {1, 3, 13});
  }
}
