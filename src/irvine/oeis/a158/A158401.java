package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158401 a(n) = 841*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158401() {
    super(1, new long[] {1, -3, 3}, new long[] {839, 3360, 7563});
  }
}
