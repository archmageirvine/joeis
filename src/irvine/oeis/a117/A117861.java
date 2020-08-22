package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117861 Number of palindromes of length n (in base 9).
 * @author Sean A. Irvine
 */
public class A117861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117861() {
    super(new long[] {9, 0}, new long[] {8, 8});
  }
}
