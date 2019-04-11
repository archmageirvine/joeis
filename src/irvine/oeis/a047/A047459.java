package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047459 Numbers that are congruent to <code>{1, 3, 4} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047459() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 4, 9});
  }
}
