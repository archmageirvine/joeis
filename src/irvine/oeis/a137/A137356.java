package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137356 <code>a(n) =</code> Sum_{k <code>&lt;= n/2 }</code> binomial(n-2k, <code>3k)</code>.
 * @author Sean A. Irvine
 */
public class A137356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137356() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {1, 1, 1, 1, 1});
  }
}
