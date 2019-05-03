package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179597 Eight white kings and one red king on a <code>3 X 3</code> chessboard. G.f.: <code>(1 + 5*x + 2*x^2)/(1 - 2*x - 11*x^2 - 6*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A179597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179597() {
    super(new long[] {6, 11, 2}, new long[] {1, 7, 27});
  }
}
