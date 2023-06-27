package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047356 Numbers that are congruent to {1, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047356() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 3, 8});
  }
}
