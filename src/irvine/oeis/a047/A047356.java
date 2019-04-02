package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047356 Numbers that are congruent to {1, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047356() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 8});
  }
}
