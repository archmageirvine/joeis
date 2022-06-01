package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180033 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1 + x)/(1 - 5*x - 5*x^2).
 * @author Sean A. Irvine
 */
public class A180033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180033() {
    super(new long[] {5, 5}, new long[] {1, 6});
  }
}
