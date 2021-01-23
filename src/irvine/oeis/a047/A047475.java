package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047475 Numbers that are congruent to {1, 2, 3} mod 8.
 * @author Sean A. Irvine
 */
public class A047475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047475() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 9});
  }
}
