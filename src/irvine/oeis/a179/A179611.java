package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179611 Eight white kings and one red king on <code>a 3</code> X 3 chessboard. G.f.: <code>(1+2*x)/(1 - 2*x - 8*x^2 - 4*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A179611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179611() {
    super(new long[] {4, 8, 2}, new long[] {1, 4, 16});
  }
}
