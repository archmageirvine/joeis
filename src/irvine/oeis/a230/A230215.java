package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230215 Numbers divisible by 3 or 13.
 * @author Sean A. Irvine
 */
public class A230215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230215() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {3, 6, 9, 12, 13, 15, 18, 21, 24, 26, 27, 30, 33, 36, 39, 42});
  }
}
