package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180033 Eight white queens and one red queen on a <code>3 X 3</code> chessboard. G.f.: <code>(1 + x)/(1 - 5*x - 5*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A180033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180033() {
    super(new long[] {5, 5}, new long[] {1, 6});
  }
}
