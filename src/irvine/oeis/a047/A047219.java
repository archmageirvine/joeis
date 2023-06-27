package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047219 Numbers that are congruent to {1, 3} mod 5.
 * @author Sean A. Irvine
 */
public class A047219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047219() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 3, 6});
  }
}
