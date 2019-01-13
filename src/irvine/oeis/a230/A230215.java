package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230215.
 * @author Sean A. Irvine
 */
public class A230215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230215() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {3, 6, 9, 12, 13, 15, 18, 21, 24, 26, 27, 30, 33, 36, 39, 42});
  }
}
