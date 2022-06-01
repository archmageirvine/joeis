package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047212 Numbers that are congruent to {0, 2, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047212() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 5});
  }
}
