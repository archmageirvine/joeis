package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180038 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1 - 3*x)/(1 - 5*x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A180038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180038() {
    super(new long[] {2, 5}, new long[] {1, 2});
  }
}
