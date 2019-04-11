package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180029 Eight white queens and one red queen on <code>a 3</code> X 3 chessboard. G.f.: <code>(1 + 2*x)/(1 - 6*x - 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A180029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180029() {
    super(new long[] {2, 6}, new long[] {1, 8});
  }
}
