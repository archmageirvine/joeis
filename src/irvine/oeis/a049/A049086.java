package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049086 Number of tilings of 4 X <code>3n</code> rectangle by 1 X 3 rectangles. Rotations and reflections are considered distinct tilings.
 * @author Sean A. Irvine
 */
public class A049086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049086() {
    super(new long[] {1, -3, 5}, new long[] {1, 3, 13});
  }
}
