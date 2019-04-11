package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047328 Numbers that are congruent to <code>{0, 3, 5, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047328() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 5, 6, 7});
  }
}
