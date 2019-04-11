package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047411 Numbers that are congruent to <code>{1, 2, 4, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047411() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 4, 6, 9});
  }
}
