package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175660 Eight bishops and one elephant on <code>a 3</code> X 3 chessboard. <code>a(n) = 2^(n+2) -</code> 3*F(n+2).
 * @author Sean A. Irvine
 */
public class A175660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175660() {
    super(new long[] {-2, -1, 3}, new long[] {1, 2, 7});
  }
}
