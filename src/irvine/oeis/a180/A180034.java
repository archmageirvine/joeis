package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180034 Eight white queens and one red queen on a <code>3 X 3</code> chessboard. G.f.: <code>(1 - 2*x)/(1 - 6*x + 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A180034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180034() {
    super(new long[] {-2, 6}, new long[] {1, 4});
  }
}
