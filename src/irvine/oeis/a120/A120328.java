package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120328 Sum of three consecutive squares: a(n) = n^2 + (n + 1)^2 + (n + 2)^2.
 * @author Sean A. Irvine
 */
public class A120328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120328() {
    super(new long[] {1, -3, 3}, new long[] {2, 5, 14});
  }
}
