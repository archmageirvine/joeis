package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047345 Numbers that are congruent to {0, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047345() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 4, 7});
  }
}
