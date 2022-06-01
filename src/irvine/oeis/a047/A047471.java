package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047471 Numbers that are congruent to {1, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047471() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 9});
  }
}
