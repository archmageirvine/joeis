package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047451 Numbers that are congruent to {0, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047451() {
    super(new long[] {-1, 1, 1}, new long[] {0, 6, 8});
  }
}
