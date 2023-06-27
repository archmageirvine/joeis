package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079472 Number of perfect matchings on an n X n L-shaped graph.
 * @author Sean A. Irvine
 */
public class A079472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079472() {
    super(1, new long[] {-1, 2, 2}, new long[] {0, 2, 4});
  }
}
