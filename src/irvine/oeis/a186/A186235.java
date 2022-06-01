package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186235 Total Wiener index of double-star trees with n nodes.
 * @author Sean A. Irvine
 */
public class A186235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186235() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {10, 18, 57, 82, 169, 220, 374});
  }
}
