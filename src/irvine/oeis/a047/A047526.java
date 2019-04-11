package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047526 Numbers that are congruent to <code>{1, 2, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047526() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 7, 9});
  }
}
