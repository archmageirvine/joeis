package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247617 a(4n) = n + 1/2 - (-1)^n/2 + (-1)^n, a(2n+1) = 2*n + 5, a(4n+2) = 2*n + 3.
 * @author Sean A. Irvine
 */
public class A247617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247617() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 5, 3, 7, 1, 9, 5, 11, 3, 13, 7, 15});
  }
}
