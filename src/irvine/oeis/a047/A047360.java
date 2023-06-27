package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047360 Numbers that are congruent to {1, 2, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047360() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 8});
  }
}
