package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158373 a(n) = 625*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158373() {
    super(1, new long[] {1, -3, 3}, new long[] {623, 2496, 5619});
  }
}
