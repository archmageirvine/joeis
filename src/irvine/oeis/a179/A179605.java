package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179605 Eight white kings and one red king on <code>a 3</code> X 3 chessboard. G.f.: <code>(1 + 3*x - 2*x^2)/(1 - 2*x - 9*x^2 - 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A179605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179605() {
    super(new long[] {2, 9, 2}, new long[] {1, 5, 17});
  }
}
