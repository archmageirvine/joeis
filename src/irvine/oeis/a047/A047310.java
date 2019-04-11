package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047310 Numbers that are congruent to <code>{0, 1, 3, 4, 5, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047310() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 5, 6, 7});
  }
}
