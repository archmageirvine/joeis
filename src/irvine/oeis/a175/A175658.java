package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175658 Eight bishops and one elephant on a 3 X 3 chessboard: a(n) = 2*Pell(n+1)+2*Pell(n)-2^n, with Pell = A000129.
 * @author Sean A. Irvine
 */
public class A175658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175658() {
    super(new long[] {-2, -3, 4}, new long[] {1, 4, 10});
  }
}
