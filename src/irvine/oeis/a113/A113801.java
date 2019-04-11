package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113801 Numbers that are congruent to <code>{1, 13} mod 14</code>.
 * @author Sean A. Irvine
 */
public class A113801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113801() {
    super(new long[] {-1, 1, 1}, new long[] {1, 13, 15});
  }
}
