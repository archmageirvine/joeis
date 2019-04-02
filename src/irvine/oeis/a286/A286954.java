package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286954 Number of maximal irredundant sets in the n-cycle graph.
 * @author Sean A. Irvine
 */
public class A286954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286954() {
    super(new long[] {-1, 0, 0, 1, 2, -1, -2, -1, 0, 1, 1, 1, 1, 0}, new long[] {0, 2, 3, 6, 10, 11, 14, 14, 30, 62, 66, 99, 143, 212});
  }
}
