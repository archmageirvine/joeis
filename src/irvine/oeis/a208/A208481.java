package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208481 Diagonal sums of triangle <code>A185384</code>.
 * @author Sean A. Irvine
 */
public class A208481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208481() {
    super(new long[] {1, 1, 0, 3}, new long[] {1, 2, 6, 19});
  }
}
