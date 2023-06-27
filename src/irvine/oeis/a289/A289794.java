package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289794 Number of 6-cycles in the n-tetrahedral graph.
 * @author Sean A. Irvine
 */
public class A289794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289794() {
    super(1, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 920, 17760, 122640, 537040, 1794240});
  }
}
