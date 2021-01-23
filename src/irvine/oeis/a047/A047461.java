package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047461 Numbers that are congruent to {1, 4} mod 8.
 * @author Sean A. Irvine
 */
public class A047461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047461() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 9});
  }
}
