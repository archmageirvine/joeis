package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047443 Numbers that are congruent to <code>{3, 5, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047443() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 6, 11});
  }
}
