package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180034 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1 - 2*x)/(1 - 6*x + 2*x^2).
 * @author Sean A. Irvine
 */
public class A180034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180034() {
    super(new long[] {-2, 6}, new long[] {1, 4});
  }
}
