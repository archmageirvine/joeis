package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287474 Number of dominating sets in the n-web graph.
 * @author Sean A. Irvine
 */
public class A287474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287474() {
    super(new long[] {9, 3, 5}, new long[] {3, 5, 31});
  }
}
