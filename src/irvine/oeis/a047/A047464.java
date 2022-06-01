package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047464 Numbers that are congruent to {0, 2, 4} mod 8.
 * @author Sean A. Irvine
 */
public class A047464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047464() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 8});
  }
}
