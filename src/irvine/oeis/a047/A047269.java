package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047269 Numbers that are congruent to <code>{0, 1, 2, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047269() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 5, 6});
  }
}
