package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079472 Number of perfect matchings on an <code>n X n L-shaped</code> graph.
 * @author Sean A. Irvine
 */
public class A079472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079472() {
    super(new long[] {-1, 2, 2}, new long[] {0, 2, 4});
  }
}
