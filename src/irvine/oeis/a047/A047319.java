package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047319 Numbers that are congruent to {5, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047319() {
    super(new long[] {-1, 1, 1}, new long[] {5, 6, 12});
  }
}
