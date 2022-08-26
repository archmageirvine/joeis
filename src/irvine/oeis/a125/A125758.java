package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125758 Numbers congruent to 4 or 7 (mod 9).
 * @author Sean A. Irvine
 */
public class A125758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125758() {
    super(new long[] {-1, 1, 1}, new long[] {4, 7, 13});
  }
}
