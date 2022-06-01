package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233289 Number of tilings of a 3 X 3 X n box using 3n bricks of shape 3 X 1 X 1.
 * @author Sean A. Irvine
 */
public class A233289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233289() {
    super(new long[] {-1, 1, -3, 4, -7, -11, 2, 13, 0, 3}, new long[] {1, 2, 4, 21, 92, 320, 1213, 4822, 18556, 70929});
  }
}
