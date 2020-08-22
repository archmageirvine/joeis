package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179596 Eight white kings and one red king on a 3 X 3 chessboard. G.f.: (1 + x)/(1 - 2*x - 11*x^2 - 6*x^3).
 * @author Sean A. Irvine
 */
public class A179596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179596() {
    super(new long[] {6, 11, 2}, new long[] {1, 3, 17});
  }
}
