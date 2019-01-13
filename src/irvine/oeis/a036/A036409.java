package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036409.
 * @author Sean A. Irvine
 */
public class A036409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036409() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 1, 1, 2, 3, 4, 5, 6, 8, 10, 11, 14});
  }
}
