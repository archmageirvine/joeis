package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291107 Number of irredundant sets in the n-pan graph.
 * @author Sean A. Irvine
 */
public class A291107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291107() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {3, 5, 7, 16, 26, 42});
  }
}
