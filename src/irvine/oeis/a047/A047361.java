package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047361 Numbers that are congruent to {0, 1, 2, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047361() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 3, 7});
  }
}
