package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175660 Eight bishops and one elephant on a 3 X 3 chessboard. a(n) = 2^(n+2) - 3*F(n+2).
 * @author Sean A. Irvine
 */
public class A175660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175660() {
    super(new long[] {-2, -1, 3}, new long[] {1, 2, 7});
  }
}
