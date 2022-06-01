package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096978 Sum of the areas of the first n Jacobsthal rectangles.
 * @author Sean A. Irvine
 */
public class A096978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096978() {
    super(new long[] {8, -14, 3, 4}, new long[] {0, 1, 4, 19});
  }
}
