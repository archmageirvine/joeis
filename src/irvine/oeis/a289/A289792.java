package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289792 Number of 4-cycles in the n-tetrahedral graph.
 * @author Sean A. Irvine
 */
public class A289792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289792() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 90, 540, 1995});
  }
}
