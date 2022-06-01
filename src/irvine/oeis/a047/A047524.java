package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047524 Numbers that are congruent to {2, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047524() {
    super(new long[] {-1, 1, 1}, new long[] {2, 7, 10});
  }
}
