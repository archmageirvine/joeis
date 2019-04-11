package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047548 Numbers that are congruent to <code>{1, 2, 3, 4, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047548() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 7, 9});
  }
}
