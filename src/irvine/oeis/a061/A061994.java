package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061994 Number of ways to place 4 nonattacking queens on an <code>n X n</code> board.
 * @author Sean A. Irvine
 */
public class A061994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061994() {
    super(new long[] {1, -3, -1, 9, 0, -12, -7, 15, 16, -16, -15, 7, 12, 0, -9, 1, 3}, new long[] {0, 0, 0, 0, 2, 82, 982, 7002, 34568, 131248, 412596, 1123832, 2739386, 6106214, 12654614, 24675650, 45704724});
  }
}
