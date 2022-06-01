package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208481 Diagonal sums of triangle A185384.
 * @author Sean A. Irvine
 */
public class A208481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208481() {
    super(new long[] {1, 1, 0, 3}, new long[] {1, 2, 6, 19});
  }
}
