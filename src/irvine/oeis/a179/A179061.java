package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179061 Number of non-attacking placements of 6 rooks on <code>an n</code> X n board.
 * @author Sean A. Irvine
 */
public class A179061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179061() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 0, 0, 0, 0, 720, 35280, 564480, 5080320, 31752000, 153679680, 614718720, 2120152320});
  }
}
