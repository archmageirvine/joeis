package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158488 a(n) = 64*n^2 + 8.
 * @author Sean A. Irvine
 */
public class A158488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158488() {
    super(1, new long[] {1, -3, 3}, new long[] {72, 264, 584});
  }
}
