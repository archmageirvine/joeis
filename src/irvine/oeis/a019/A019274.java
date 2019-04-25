package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019274 Number of recursive calls needed to compute the n-th Fibonacci number <code>F(n),</code> starting with <code>F(1) = F(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A019274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019274() {
    super(new long[] {-1, 0, 2}, new long[] {0, 0, 2});
  }
}
