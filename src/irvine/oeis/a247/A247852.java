package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247852 The 7th Hermite Polynomial evaluated at n: H_7(n) = 128*n^7 -1344*n^5 + 3360*n^3 - 1680*n.
 * @author Sean A. Irvine
 */
public class A247852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247852() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 464, -3104, 39024, 929216, 6211600, 26096544, 83965616});
  }
}
