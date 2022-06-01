package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180029 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1 + 2*x)/(1 - 6*x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A180029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180029() {
    super(new long[] {2, 6}, new long[] {1, 8});
  }
}
