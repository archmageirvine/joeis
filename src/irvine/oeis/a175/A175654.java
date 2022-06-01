package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175654 Eight bishops and one elephant on a 3 X 3 chessboard. G.f.: (1 - x - x^2)/(1 - 3*x - x^2 + 6*x^3).
 * @author Sean A. Irvine
 */
public class A175654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175654() {
    super(new long[] {-6, 1, 3}, new long[] {1, 2, 6});
  }
}
