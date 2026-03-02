package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239333 Number of n X 1 0..3 arrays with no element equal to one plus the sum of elements to its left or three plus the sum of elements above it, modulo 4.
 * @author Sean A. Irvine
 */
public class A239333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239333() {
    super(new long[] {2, 0, 2}, new long[] {1, 2, 5});
  }
}
