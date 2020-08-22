package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032769 Numbers that are congruent to {0, 1, 2, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A032769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032769() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 4, 5});
  }
}
