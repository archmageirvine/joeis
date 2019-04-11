package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047482 Numbers that are congruent to <code>{1, 2, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047482() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 5, 7, 9});
  }
}
