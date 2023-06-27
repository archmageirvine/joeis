package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047268 Numbers that are congruent to {1, 2, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047268() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 5, 7});
  }
}
