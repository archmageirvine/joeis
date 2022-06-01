package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157668 a(n) = 729*n^2 - 442*n + 67.
 * @author Sean A. Irvine
 */
public class A157668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157668() {
    super(new long[] {1, -3, 3}, new long[] {354, 2099, 5302});
  }
}
