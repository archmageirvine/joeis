package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047330 Numbers that are congruent to {0, 1, 3, 5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047330() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 6, 7});
  }
}
