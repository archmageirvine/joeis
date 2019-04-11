package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047218 Numbers that are congruent to <code>{0, 3} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047218() {
    super(new long[] {-1, 1, 1}, new long[] {0, 3, 5});
  }
}
