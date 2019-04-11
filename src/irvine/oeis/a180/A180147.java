package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180147 Eight rooks and one berserker on <code>a 3</code> X 3 chessboard. G.f.: <code>(1 + 3*x)/(1 - 4*x - 3*x^2 + 6*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A180147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180147() {
    super(new long[] {-6, 3, 4}, new long[] {1, 7, 31});
  }
}
