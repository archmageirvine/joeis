package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288916 Number of 5-cycles in the <code>n X n</code> queen graph.
 * @author Sean A. Irvine
 */
public class A288916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288916() {
    super(new long[] {1, -2, -3, 7, 4, -9, -6, 6, 9, -4, -7, 3, 2}, new long[] {0, 0, 376, 4644, 23920, 81876, 219384, 499544, 1014160, 1885960, 3280968, 5402716, 8516848});
  }
}
