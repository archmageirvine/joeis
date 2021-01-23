package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259754 Numbers that are congruent to {3,9,15,18,21} mod 24.
 * @author Sean A. Irvine
 */
public class A259754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259754() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {3, 9, 15, 18, 21, 27});
  }
}
