package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064831 Partial sums of A001654, or sum of the areas of the first n Fibonacci rectangles.
 * @author Sean A. Irvine
 */
public class A064831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064831() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 1, 3, 9});
  }
}
