package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047441 Numbers that are congruent to <code>{0, 2, 5, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047441() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 5, 6, 8});
  }
}
