package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158413 a(n) = 961*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158413() {
    super(1, new long[] {1, -3, 3}, new long[] {963, 3848, 8655});
  }
}
