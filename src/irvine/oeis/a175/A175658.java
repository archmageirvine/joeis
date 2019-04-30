package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175658 Eight bishops and one elephant on <code>a 3</code> X 3 chessboard: <code>a(n) = 2*Pell(n+1)+2*Pell(n)-2^n</code>, with Pell = A000129.
 * @author Sean A. Irvine
 */
public class A175658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175658() {
    super(new long[] {-2, -3, 4}, new long[] {1, 4, 10});
  }
}
