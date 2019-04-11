package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094895 Sequence generated from a Knight's tour of <code>a 4</code> X 4 chessboard considered as a matrix.
 * @author Sean A. Irvine
 */
public class A094895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094895() {
    super(new long[] {544, 324, 24}, new long[] {1, 280, 8524});
  }
}
