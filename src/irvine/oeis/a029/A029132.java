package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029132.
 * @author Sean A. Irvine
 */
public class A029132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029132() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 8, 9, 10, 10, 10, 10, 10, 11, 12, 14, 16});
  }
}
