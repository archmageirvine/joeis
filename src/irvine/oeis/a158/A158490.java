package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158490 a(n) = 100*n^2 - 10.
 * @author Sean A. Irvine
 */
public class A158490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158490() {
    super(1, new long[] {1, -3, 3}, new long[] {90, 390, 890});
  }
}
