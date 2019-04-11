package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176174 Starting with <code>1,</code> multiply the n-th term by <code>10,</code> then subtract the sum of all terms up to and including the n-th, to make the (n+1)th term.
 * @author Sean A. Irvine
 */
public class A176174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176174() {
    super(new long[] {-10, 10}, new long[] {1, 9});
  }
}
