package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024215 Sum of squares of first n positive integers congruent to 1 mod 3.
 * @author Sean A. Irvine
 */
public class A024215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024215() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 17, 66, 166});
  }
}
