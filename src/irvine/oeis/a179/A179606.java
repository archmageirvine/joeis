package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179606 Eight white kings and one red king on a 3 X 3 chessboard. G.f.: (1 + x)/(1 - 3*x - 5*x^2).
 * @author Sean A. Irvine
 */
public class A179606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179606() {
    super(new long[] {5, 3}, new long[] {1, 4});
  }
}
