package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175654 Eight bishops and one elephant on a <code>3 X 3</code> chessboard. G.f.: <code>(1 - x - x^2)/(1 - 3*x - x^2 + 6*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A175654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175654() {
    super(new long[] {-6, 1, 3}, new long[] {1, 2, 6});
  }
}
