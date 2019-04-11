package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047386 Numbers that are congruent to <code>{0, 2, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047386() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 5, 7});
  }
}
