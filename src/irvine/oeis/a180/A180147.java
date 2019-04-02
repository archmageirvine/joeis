package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180147 Eight rooks and one berserker on a 3 X 3 chessboard. G.f.: (1 + 3*x)/(1 - 4*x - 3*x^2 + 6*x^3).
 * @author Sean A. Irvine
 */
public class A180147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180147() {
    super(new long[] {-6, 3, 4}, new long[] {1, 7, 31});
  }
}
