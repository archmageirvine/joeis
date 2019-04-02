package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241199 Numbers n such that 4 consecutive terms of binomial(n,k) satisfy a quadratic relation for 0 &lt;= k &lt;= n/2.
 * @author Sean A. Irvine
 */
public class A241199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241199() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {14, 19, 31, 38, 54});
  }
}
