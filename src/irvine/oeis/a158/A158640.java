package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158640 a(n) = 52*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158640() {
    super(new long[] {1, -3, 3}, new long[] {51, 207, 467});
  }
}
