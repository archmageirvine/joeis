package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047438 Numbers that are congruent to <code>{1, 5, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047438() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 6, 9});
  }
}
