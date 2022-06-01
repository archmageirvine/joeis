package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018842 Number of squares on infinite chessboard at n knight's moves from center.
 * @author Sean A. Irvine
 */
public class A018842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018842() {
    super(new long[] {-1, 2}, new long[] {120, 148}, 1, 8, 32, 68, 96);
  }
}
