package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179059 Number of non-attacking placements of 4 rooks on <code>an n</code> X n board.
 * @author Sean A. Irvine
 */
public class A179059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179059() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 24, 600, 5400, 29400, 117600, 381024});
  }
}
