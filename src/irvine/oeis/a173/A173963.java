package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173963 Number of nonoverlapping placements of one <code>1 X 1</code> square and one <code>2 X 2</code> square on an <code>n X n</code> board.
 * @author Sean A. Irvine
 */
public class A173963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173963() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 20, 108, 336});
  }
}
