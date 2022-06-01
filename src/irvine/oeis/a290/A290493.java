package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290493 Number of irredundant sets in the n-cycle graph.
 * @author Sean A. Irvine
 */
public class A290493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290493() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {1, 3, 4, 11, 16, 24});
  }
}
