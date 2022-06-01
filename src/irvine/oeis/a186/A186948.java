package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186948 a(n) = 3^n - 2*n.
 * @author Sean A. Irvine
 */
public class A186948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186948() {
    super(new long[] {3, -7, 5}, new long[] {1, 1, 5});
  }
}
