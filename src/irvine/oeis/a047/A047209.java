package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047209 Numbers that are congruent to {1, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047209() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 4, 6});
  }
}
