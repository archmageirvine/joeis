package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179602 Eight white kings and one red king on a <code>3 X 3</code> chessboard. G.f.: <code>(1 + 2*x)/(1 - 3*x - 7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A179602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179602() {
    super(new long[] {7, 3}, new long[] {1, 5});
  }
}
