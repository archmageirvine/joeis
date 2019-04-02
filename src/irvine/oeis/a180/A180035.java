package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180035 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1+x)/(1-5*x-3*x^2).
 * @author Sean A. Irvine
 */
public class A180035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180035() {
    super(new long[] {3, 5}, new long[] {1, 6});
  }
}
