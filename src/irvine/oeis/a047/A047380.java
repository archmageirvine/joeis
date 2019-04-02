package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047380 Numbers that are congruent to {1, 2, 4, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047380() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 4, 5, 8});
  }
}
