package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180037 Eight white queens and one red queen on a 3 X 3 chessboard. G.f.: (1+x)/(1-5*x-2*x^2).
 * @author Sean A. Irvine
 */
public class A180037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180037() {
    super(new long[] {2, 5}, new long[] {1, 6});
  }
}
