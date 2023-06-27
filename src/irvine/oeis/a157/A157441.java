package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157441 a(n) = 1331*n - 1122.
 * @author Sean A. Irvine
 */
public class A157441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157441() {
    super(1, new long[] {-1, 2}, new long[] {209, 1540});
  }
}
