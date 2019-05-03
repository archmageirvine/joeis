package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176174 Starting with 1, multiply the n-th term by 10, then subtract the sum of all terms up to and including the <code>n-th</code>, to make the <code>(n+1)th</code> term.
 * @author Sean A. Irvine
 */
public class A176174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176174() {
    super(new long[] {-10, 10}, new long[] {1, 9});
  }
}
