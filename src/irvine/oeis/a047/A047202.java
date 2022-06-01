package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047202 Numbers that are congruent to {2, 3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047202() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 4, 7});
  }
}
