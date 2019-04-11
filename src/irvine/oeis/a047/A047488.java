package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047488 Numbers that are congruent to <code>{0, 2, 3, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047488() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 8});
  }
}
