package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168484 Numbers that are congruent to {2, 3, 5, 7} mod 11.
 * @author Sean A. Irvine
 */
public class A168484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168484() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 5, 7, 13});
  }
}
