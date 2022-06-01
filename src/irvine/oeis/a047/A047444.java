package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047444 Numbers that are congruent to {0, 3, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047444() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 3, 5, 6});
  }
}
