package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137356 a(n) = Sum_{k &lt;= n/2 } binomial(n-2k, 3k).
 * @author Sean A. Irvine
 */
public class A137356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137356() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {1, 1, 1, 1, 1});
  }
}
