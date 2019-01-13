package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036119.
 * @author Sean A. Irvine
 */
public class A036119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036119() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 9, 10, 13, 5, 15, 11, 16});
  }
}
