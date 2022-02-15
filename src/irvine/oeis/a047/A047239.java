package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047239 Numbers that are congruent to {1, 2} (mod 6).
 * @author Sean A. Irvine
 */
public class A047239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047239() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 7});
  }
}
