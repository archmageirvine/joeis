package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117868 Number of palindromes (in base 9) below 9^n.
 * @author Sean A. Irvine
 */
public class A117868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117868() {
    super(1, new long[] {-9, 9, 1}, new long[] {8, 16, 88});
  }
}
