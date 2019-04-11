package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047478 Numbers that are congruent to <code>{1, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047478() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 7, 9});
  }
}
