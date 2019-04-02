package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047508 Numbers that are congruent to {1, 4, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047508() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 4, 6, 7});
  }
}
