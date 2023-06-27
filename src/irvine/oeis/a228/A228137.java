package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228137 Numbers that are congruent to {1, 4} mod 12.
 * @author Sean A. Irvine
 */
public class A228137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228137() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 4, 13});
  }
}
