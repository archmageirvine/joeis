package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162484 a(1) = 2, a(2) = 8; a(n) = 2 a(n - 1) + a(n - 2) - 4*(n mod 2).
 * @author Sean A. Irvine
 */
public class A162484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162484() {
    super(1, new long[] {-1, -2, 2, 2}, new long[] {2, 8, 14, 36});
  }
}
