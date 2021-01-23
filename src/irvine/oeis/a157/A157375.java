package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157375 a(n) = 2401*n^2 - 980*n + 99.
 * @author Sean A. Irvine
 */
public class A157375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157375() {
    super(new long[] {1, -3, 3}, new long[] {1520, 7743, 18768});
  }
}
