package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047259 Numbers that are congruent to <code>{1, 4, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047259() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 5, 7});
  }
}
