package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239229 Euler characteristic of n-holed torus: 2 - 2*n.
 * @author Sean A. Irvine
 */
public class A239229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239229() {
    super(new long[] {-1, 2}, new long[] {2, 0});
  }
}
