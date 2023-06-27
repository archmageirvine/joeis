package irvine.oeis.a297;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A297665 Number of chordless cycles in the n-web graph.
 * @author Georg Fischer
 */
public class A297665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297665() {
    super(3, new long[] {1L, -2L, 0L, 4L, -6L, 4L}, new long[] {10L, 17L, 26L, 37L, 54L, 83L}, 3);
  }
}
