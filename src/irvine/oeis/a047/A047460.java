package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047460 Numbers that are congruent to <code>{0, 1, 3, 4} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047460() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 4, 8});
  }
}
