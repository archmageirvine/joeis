package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047357 Numbers that are congruent to {0, 1, 3} mod 7.
 * @author Sean A. Irvine
 */
public class A047357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047357() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 7});
  }
}
