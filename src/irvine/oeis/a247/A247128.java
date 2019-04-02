package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247128 Positive numbers that are congruent to {0,5,9,13,17} mod 22.
 * @author Sean A. Irvine
 */
public class A247128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247128() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 9, 13, 17, 22, 27});
  }
}
