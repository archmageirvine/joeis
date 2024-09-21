package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157040 a(n) = 121*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A157040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157040() {
    super(1, new long[] {1, -3, 3}, new long[] {119, 480, 1083});
  }
}
