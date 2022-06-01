package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047296 Numbers that are congruent to {3, 4, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047296() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 4, 6, 10});
  }
}
