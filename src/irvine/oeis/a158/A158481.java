package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158481 a(n) = 49*n^2 + 7.
 * @author Sean A. Irvine
 */
public class A158481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158481() {
    super(1, new long[] {1, -3, 3}, new long[] {56, 203, 448});
  }
}
