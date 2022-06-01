package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091998 Numbers that are congruent to {1, 11} mod 12.
 * @author Sean A. Irvine
 */
public class A091998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091998() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 13});
  }
}
