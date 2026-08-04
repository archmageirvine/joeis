package irvine.oeis.a297;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A297349 Number of edge covers in the 2 X n king graph.
 * @author Georg Fischer
 */
public class A297349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297349() {
    super(0, new long[] {-24L, 36L, 29L}, new long[] {1L, 1L, 41L});
  }
}
