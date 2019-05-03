package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179604 Eight white kings and one red king on a <code>3 X 3</code> chessboard. G.f.: <code>(1 + x)/(1 - 2*x - 9*x^2 - 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A179604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179604() {
    super(new long[] {2, 9, 2}, new long[] {1, 3, 15});
  }
}
