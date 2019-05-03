package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187179 Number of nontrivial compositions of differential operations and directional derivative of the n-th order on the space <code>R^10</code>.
 * @author Sean A. Irvine
 */
public class A187179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187179() {
    super(new long[] {-1, 0, 2}, new long[] {7, 7, 8});
  }
}
