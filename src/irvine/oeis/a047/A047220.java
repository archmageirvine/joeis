package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047220 Numbers that are congruent to {0, 1, 3} mod 5.
 * @author Sean A. Irvine
 */
public class A047220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047220() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 5});
  }
}
