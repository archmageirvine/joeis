package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187107 Number of nontrivial compositions of differential operations and directional derivative of the n-th order on the space R^9.
 * @author Sean A. Irvine
 */
public class A187107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187107() {
    super(1, new long[] {-1, 0, 2}, new long[] {8, 8, 9});
  }
}
