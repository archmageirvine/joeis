package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019274 Number of recursive calls needed to compute the n-th Fibonacci number F(n), starting with F(1) = F(2) = 1.
 * @author Sean A. Irvine
 */
public class A019274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019274() {
    super(1, new long[] {-1, 0, 2}, new long[] {0, 0, 2});
  }
}
