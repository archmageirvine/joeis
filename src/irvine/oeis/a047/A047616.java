package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047616 Numbers that are congruent to {0, 1, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047616() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 5, 8});
  }
}
