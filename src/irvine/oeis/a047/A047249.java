package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047249 Numbers that are congruent to <code>{3, 4, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047249() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 4, 5, 9});
  }
}
