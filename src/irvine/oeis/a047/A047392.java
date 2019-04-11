package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047392 Numbers that are congruent to <code>{0, 1, 3, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047392() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 5, 7});
  }
}
