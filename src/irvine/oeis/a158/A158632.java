package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158632 a(n) = 46*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158632() {
    super(new long[] {1, -3, 3}, new long[] {1, 47, 185});
  }
}
