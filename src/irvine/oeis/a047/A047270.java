package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047270 Numbers that are congruent to {3, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047270() {
    super(new long[] {-1, 1, 1}, new long[] {3, 5, 9});
  }
}
