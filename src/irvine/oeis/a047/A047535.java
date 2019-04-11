package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047535 Numbers that are congruent to <code>{4, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047535() {
    super(new long[] {-1, 1, 1}, new long[] {4, 7, 12});
  }
}
