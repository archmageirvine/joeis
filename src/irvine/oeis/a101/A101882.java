package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101882 Write three numbers, skip one, write three, skip two, write three, skip three... and so on.
 * @author Sean A. Irvine
 */
public class A101882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101882() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 5, 6, 7, 10});
  }
}
