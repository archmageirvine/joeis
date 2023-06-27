package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287426 Number of connected induced subgraphs in the n-sun graph.
 * @author Sean A. Irvine
 */
public class A287426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287426() {
    super(1, new long[] {2, -1, -5, 5}, new long[] {3, 14, 47, 164});
  }
}
