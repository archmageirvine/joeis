package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020524 a(n) = 4th Euler polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020524() {
    super(new long[] {256, -176, 26}, new long[] {0, 2, 132});
  }
}
