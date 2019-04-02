package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179601 Eight white kings and one red king on a 3 X 3 chessboard. G.f.: (1+4*x)/(1 - 2*x - 10*x^2 - 4*x^3).
 * @author Sean A. Irvine
 */
public class A179601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179601() {
    super(new long[] {4, 10, 2}, new long[] {1, 6, 22});
  }
}
