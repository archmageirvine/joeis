package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218348 Number of n X 2 binary arrays with every 0 a horizontal or vertical neighbor to some 1.
 * @author Sean A. Irvine
 */
public class A218348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218348() {
    super(1, new long[] {-1, -1, 2, 2, 3}, new long[] {3, 11, 41, 149, 547});
  }
}
