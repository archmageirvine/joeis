package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228494.
 * @author Sean A. Irvine
 */
public class A228494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228494() {
    super(new long[] {-1, -2, -3, -2, -1, 2, 2, 2, 0, 0}, new long[] {0, 0, 0, 1, 2, 3, 4, 7, 12, 17});
  }
}
