package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047376 Numbers that are congruent to {1, 4, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047376() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 4, 5, 8});
  }
}
