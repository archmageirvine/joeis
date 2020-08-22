package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047388 Numbers that are congruent to {0, 1, 2, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047388() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 5, 7});
  }
}
