package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158403 a(n) = 841*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158403() {
    super(1, new long[] {1, -3, 3}, new long[] {843, 3368, 7575});
  }
}
