package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047273 Numbers that are congruent to <code>{0, 1, 3, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047273() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 1, 3, 5});
  }
}
