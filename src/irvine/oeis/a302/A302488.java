package irvine.oeis.a302;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A302488 Total domination number of the n X n grid graph.
 * @author Georg Fischer
 */
public class A302488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302488() {
    super(0, new long[] {1L, -2L, 1L, 0L, -1L, 2L}, new long[] {0, 1L, 2L, 3L, 6L, 9L});
  }
}
