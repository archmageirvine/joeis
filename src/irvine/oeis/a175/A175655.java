package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175655 Eight bishops and one elephant on <code>a 3</code> X 3 chessboard. G.f.: <code>(1+x-5*x^2)/(1-3*x-x^2+6*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A175655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175655() {
    super(new long[] {-6, 1, 3}, new long[] {1, 4, 8});
  }
}
