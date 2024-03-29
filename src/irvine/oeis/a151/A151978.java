package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151978 Numbers that are congruent to {0, 1} mod 17.
 * @author Sean A. Irvine
 */
public class A151978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151978() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 1, 17});
  }
}
