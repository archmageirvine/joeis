package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079344 F(n) mod 8, where F(n) = A000045(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A079344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079344() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 0, 5, 5});
  }
}
