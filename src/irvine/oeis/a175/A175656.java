package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175656 Eight bishops and one elephant on a 3 X 3 chessboard. G.f.: (1-3*x^2)/(1-3*x+4*x^3).
 * @author Sean A. Irvine
 */
public class A175656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175656() {
    super(new long[] {-4, 0, 3}, new long[] {1, 3, 6});
  }
}
