package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047347 Numbers that are congruent to {0, 1, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047347() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 4, 7});
  }
}
