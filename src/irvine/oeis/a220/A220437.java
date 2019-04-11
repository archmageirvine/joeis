package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220437 Number of domino tilings of a cross whose center is <code>a 4</code> X 4 square and in which each of the four arms has length n.
 * @author Sean A. Irvine
 */
public class A220437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220437() {
    super(new long[] {1, -5, -35, 67, 145, -145, -67, 35, 5}, new long[] {6, 28, 340, 2304, 20652, 157926, 1313248, 10426852, 84878208});
  }
}
