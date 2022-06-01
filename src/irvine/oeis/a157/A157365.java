package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157365 a(n) = 49*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A157365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157365() {
    super(new long[] {1, -3, 3}, new long[] {51, 200, 447});
  }
}
