package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158587 a(n) = 289*n^2 - 17.
 * @author Sean A. Irvine
 */
public class A158587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158587() {
    super(1, new long[] {1, -3, 3}, new long[] {272, 1139, 2584});
  }
}
