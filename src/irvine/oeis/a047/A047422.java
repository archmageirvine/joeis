package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047422 Numbers that are congruent to {1, 2, 3, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047422() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 9});
  }
}
