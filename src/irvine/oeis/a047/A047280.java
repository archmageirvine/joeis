package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047280 Numbers that are congruent to <code>{3, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047280() {
    super(new long[] {-1, 1, 1}, new long[] {3, 6, 10});
  }
}
