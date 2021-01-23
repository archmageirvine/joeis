package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180028 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1 + 3*x)/(1 - 6*x - 3*x^2).
 * @author Sean A. Irvine
 */
public class A180028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180028() {
    super(new long[] {3, 6}, new long[] {1, 9});
  }
}
