package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047619 Numbers that are congruent to {1, 2, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047619() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 5, 9});
  }
}
