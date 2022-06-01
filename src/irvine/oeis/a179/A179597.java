package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179597 Eight white kings and one red king on a 3 X 3 chessboard. G.f.: (1 + 5*x + 2*x^2)/(1 - 2*x - 11*x^2 - 6*x^3).
 * @author Sean A. Irvine
 */
public class A179597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179597() {
    super(new long[] {6, 11, 2}, new long[] {1, 7, 27});
  }
}
