package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083031 Numbers that are congruent to {0, 3, 7} mod 12.
 * @author Sean A. Irvine
 */
public class A083031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083031() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 3, 7, 12});
  }
}
