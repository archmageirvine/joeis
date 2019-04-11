package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047292 Numbers that are congruent to <code>{2, 4, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047292() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 4, 6, 9});
  }
}
